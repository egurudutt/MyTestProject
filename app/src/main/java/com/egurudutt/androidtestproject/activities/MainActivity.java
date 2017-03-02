package com.egurudutt.androidtestproject.activities;

import android.os.Bundle;

import com.egurudutt.androidtestproject.fragments.MainFragment;

public class MainActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainFragment fragment = MainFragment.newInstance();
        addFragment(fragment, false);
    }
}
