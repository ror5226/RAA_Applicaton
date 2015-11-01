package com.example.raa.raa_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;

public class UserRAAPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_raapage);

        ImageButton button = (ImageButton) findViewById(R.id.mailButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }

        });

    }

    private void goToSecondActivity(){
        Intent intent = new Intent(this, UserInbox.class);
        startActivity(intent);
    }

}
