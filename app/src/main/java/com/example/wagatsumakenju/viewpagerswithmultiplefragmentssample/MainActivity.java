package com.example.wagatsumakenju.viewpagerswithmultiplefragmentssample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {

    /**
     * fields
     */
    private static final int NUMBER_OF_PAGES = 3;

    /**
     * {@inheritDoc}
     */
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

        /**
         * Constructor
         * @param fm
         */
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment based on the position.
         * @param position
         * @return
         */
        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0: return FirstFragment.newInstance("FirstFragment, Instance 1");
                case 1: return SecondFragment.newInstance("SecondFragment, Instance 1");
                case 2: return ThirdFragment.newInstance("ThirdFragment, Instance 1");
                default: return FirstFragment.newInstance("FirstFragment, Default");
            }
        }

        /**
         * Return the number of pages.
         * @return
         */
        @Override
        public int getCount() {
            return NUMBER_OF_PAGES;
        }
    }


}
