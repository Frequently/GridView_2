package com.example.harshal.gridview_2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }


    public void initView() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent movieIntent = new Intent(Splash.this,MainActivity.class);
                startActivity(movieIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }

}
