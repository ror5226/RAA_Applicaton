package com.example.allisonsteinmetz.raa_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by allisonsteinmetz on 11/8/15.
 */
public class Inbox extends android.support.v4.app.Fragment {
    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.inbox, container, false);
        return rootView;
    }
}
