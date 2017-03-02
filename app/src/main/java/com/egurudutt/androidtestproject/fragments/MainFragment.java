package com.egurudutt.androidtestproject.fragments;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.egurudutt.androidtestproject.R;
import com.egurudutt.androidtestproject.adapters.MyPagerAdapter;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class MainFragment extends MyFragment implements ViewPager.OnPageChangeListener {

    private ViewPager mViewPager = null;
    private TabLayout mTabLayout = null;
    private static final String EXTRA_PAGE_INDEX = "com.egurudutt.androidtestproject.extra_page_index";

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.main_fragment, container, false);
        mTabLayout = (TabLayout) fragmentView.findViewById(R.id.tabs);
        mViewPager = (ViewPager) fragmentView.findViewById(R.id.pager);
        mViewPager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);
        int numberOfTabs = mTabLayout.getTabCount();
        for (int tabIndex = 0; tabIndex < numberOfTabs; ++tabIndex) {
            TabLayout.Tab tab = mTabLayout.getTabAt(tabIndex);
            if (tab != null) {
                tab.setCustomView(R.layout.my_tab);
            }
        }
        mViewPager.getAdapter().registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                PagerAdapter adapter = mViewPager.getAdapter();
                if (adapter != null) {
                    mTabLayout.removeAllTabs();
                    int i = 0;
                    for (int count = adapter.getCount(); i < count; ++i) {
                        mTabLayout.addTab(mTabLayout.newTab().setText(adapter.getPageTitle(i)).setCustomView(R.layout.my_tab), false);
                    }
                }
            }
        });
        mViewPager.addOnPageChangeListener(this);
        return fragmentView;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mViewPager != null) {
            outState.putInt(EXTRA_PAGE_INDEX, mViewPager.getCurrentItem());
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            mViewPager.setCurrentItem(savedInstanceState.getInt(EXTRA_PAGE_INDEX, 0));
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
