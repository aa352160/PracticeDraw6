package com.hencoder.hencoderpracticedraw6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hencoder.hencoderpracticedraw6.practice.CustomPractice;

/**
 * Created by Administrator on 2018/1/27.
 */

public class CustomPracticeFragment extends Fragment {
    public static CustomPracticeFragment newInstance() {
        return new CustomPracticeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_custom_practice, container, false);
        final CustomPractice customPractice =
                (CustomPractice)inflate.findViewById(R.id.view_custom_practice);
        inflate.findViewById(R.id.btn_start_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customPractice.startAnim();
            }
        });

        return inflate;
    }
}
