package com.example.wagatsumakenju.viewpagerswithmultiplefragmentssample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    /**
     * Custom Page adapter
     */
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch(i) {
                case 0: return FirstFragment.newInstance("FirstFragment, Instance 1");
                case 1: return SecondFragment.newInstance("SecondFragment, Instance 1");
                default: return FirstFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}
