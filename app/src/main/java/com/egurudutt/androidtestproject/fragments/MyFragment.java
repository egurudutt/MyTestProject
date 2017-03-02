package com.egurudutt.androidtestproject.fragments;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class MyFragment extends Fragment {

    protected View findViewById(int id) {
        View rootView = getView();
        if (rootView == null) {
            return null;
        } else {
            return rootView.findViewById(id);
        }
    }
}
