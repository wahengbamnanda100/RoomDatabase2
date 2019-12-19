package com.example.roomdatabase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LastActivity extends AppCompatActivity {


    private static int SPLASH_SCREEN_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);


        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent intent = new Intent(LastActivity.this,MainActivity.class);

                startActivity(intent);

                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}
