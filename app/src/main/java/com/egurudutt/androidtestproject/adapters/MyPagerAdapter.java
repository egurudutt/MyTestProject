package com.egurudutt.androidtestproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.egurudutt.androidtestproject.fragments.DiscoverFragment;
import com.egurudutt.androidtestproject.fragments.MapFragment;
import com.egurudutt.androidtestproject.fragments.ListFragment;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private int mTabCount = 3;

    public static final int LIST_TAB = 0;
    public static final int CENTER_TAB = 1;
    public static final int MAP_TAB = 2;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return mTabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case LIST_TAB:
                return ListFragment.newInstance();
            case CENTER_TAB:
                return DiscoverFragment.newInstance();
            case MAP_TAB:
                return MapFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public CharSequence getPageTitle(int index) {
        switch (index) {
            case LIST_TAB:
                return "List";
            case CENTER_TAB:
                return "Discover";
            case MAP_TAB:
                return "Map";
        }
        return null;
    }

}
