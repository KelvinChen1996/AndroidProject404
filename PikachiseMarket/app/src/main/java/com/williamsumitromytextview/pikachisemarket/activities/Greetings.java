package com.williamsumitromytextview.pikachisemarket.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.williamsumitromytextview.pikachisemarket.R;

public class Greetings extends AppCompatActivity {
    private static int splashtimer = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Greetings.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, splashtimer);
    }
}
