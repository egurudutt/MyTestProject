package com.egurudutt.androidtestproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.egurudutt.androidtestproject.R;

/**
 * Created by gurudutt on 01/03/2017.
 */

public class ListFragment extends MyFragment implements View.OnClickListener, TextView.OnEditorActionListener, TextWatcher, View.OnTouchListener, View.OnKeyListener {

    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.common_search_fragment, container, false);

        EditText searchField = (EditText) fragmentView.findViewById(R.id.search_field);
        if (searchField != null) {
            searchField.addTextChangedListener(this);
            searchField.setOnEditorActionListener(this);
            searchField.setOnKeyListener(this);
            searchField.setOnTouchListener(this);
        }

        ImageButton citySearchImageButton = (ImageButton) fragmentView.findViewById(R.id.search_image_button);
        if (citySearchImageButton != null) {
            citySearchImageButton.setVisibility(View.GONE);
            citySearchImageButton.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            citySearchImageButton.setOnClickListener(this);
        }

        ImageButton searchIconButton = (ImageButton) fragmentView.findViewById(R.id.search_image_icon_button);
        if (searchIconButton != null) {
            searchIconButton.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            searchIconButton.setPadding(getResources().getDimensionPixelSize(R.dimen.marginBaseDouble), 0, 0, 0);
            searchIconButton.setOnClickListener(this);
        }

        return fragmentView;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }
}
