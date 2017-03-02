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

public class MapFragment extends MyFragment {

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.map_fragment, container, false);
        return fragmentView;
    }
}
