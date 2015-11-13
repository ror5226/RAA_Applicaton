package com.example.allisonsteinmetz.raa_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by allisonsteinmetz on 11/8/15.
 */
public class Profile extends android.support.v4.app.Fragment {
    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.profile, container, false);

        Button newPage = (Button)rootView.findViewById(R.id.courseSelectionButton);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CoursesList.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
