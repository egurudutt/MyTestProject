package com.egurudutt.androidtestproject.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by gurudutt on 02/03/2017.
 */

public class ViewPagerEx extends ViewPagerWorkaround {

    private boolean mSwipeEnabled = true;

    public ViewPagerEx(Context context) {
        super(context);
    }

    public ViewPagerEx(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {

        if (!isSwipeEnabled()) {
            return false;
        }

        return super.onInterceptTouchEvent(event);
    }

    public void disableSwipe() {
        mSwipeEnabled = false;
    }

    public void enableSwipe() {
        mSwipeEnabled = true;
    }

    public boolean isSwipeEnabled() {
        return mSwipeEnabled;
    }

}
