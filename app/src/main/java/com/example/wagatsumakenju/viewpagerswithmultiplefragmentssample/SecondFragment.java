package com.example.wagatsumakenju.viewpagerswithmultiplefragmentssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wagatsumakenju on 2015/08/25.
 */
public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_frag, container, false);

        TextView textView = (TextView) v.findViewById(R.id.tvFragSecond);
        textView.setText(getArguments().getString("msg"));

        return v;
    }

    public static SecondFragment newInstance(String text){
        SecondFragment f = new SecondFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);
        return f;
    }
}
