package com.example.wagatsumakenju.viewpagerswithmultiplefragmentssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment class.
 *
 * Created by wagatsumakenju on 2015/08/25.
 */
public class ThirdFragment extends Fragment {

    /**
     * Create fragment view when paginated.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.third_frag, container, false);

        TextView textView = (TextView) v.findViewById(R.id.tvFragThird);
        textView.setText(getArguments().getString("msg"));

        return v;
    }

    /**
     * Returns new instance.
     *
     * @param text
     * @return
     */
    public static ThirdFragment newInstance(String text){

        // new instance
        ThirdFragment fragment = new ThirdFragment();

        // sets data to bundle
        Bundle bundle = new Bundle();
        bundle.putString("msg", text);

        // set data to fragment
        fragment.setArguments(bundle);

        return fragment;
    }
}
