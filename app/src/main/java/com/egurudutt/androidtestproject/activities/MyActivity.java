package com.egurudutt.androidtestproject.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class MyActivity extends AppCompatActivity {

    protected void addFragment(Fragment fragment, boolean addToBackStackAndAnimate) {
        addFragment(fragment,
                null,
                addToBackStackAndAnimate,
                null,
                addToBackStackAndAnimate,
                android.R.anim.fade_in,
                android.R.anim.fade_out,
                android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    protected void addFragment(Fragment fragment, String fragmentTag, boolean addToBackStack, String backStackName, boolean animateTransition, int enter, int exit, int popEnter, int popExit) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (animateTransition)
            ft.setCustomAnimations(enter, exit, popEnter, popExit);
        ft.replace(android.R.id.content, fragment, fragmentTag);
        if (addToBackStack)
            ft.addToBackStack(backStackName);
        try {
            ft.commit();
        } catch (IllegalStateException ignored) {
        }
    }

    @Override
    public void finish() {
        if (hasBackStackEntries())
            onBackPressed();
        else
            super.finish();
    }

    protected boolean hasBackStackEntries() {
        return getSupportFragmentManager().getBackStackEntryCount() > 0;
    }

}
