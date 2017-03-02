package com.egurudutt.androidtestproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.egurudutt.androidtestproject.R;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class DiscoverFragment extends MyFragment {

    public static DiscoverFragment newInstance() {
        return new DiscoverFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.discover_fragment, container, false);
        return fragmentView;
    }

}
