package com.example.administrator.test_2016_03_13;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * TitleFragment
 *
 * @author: Xingkai Ren
 * @time: 2016/3/13  15:43
 */
public class TitleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.title,container,false);
        return view;
    }
}
