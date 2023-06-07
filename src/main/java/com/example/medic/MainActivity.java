package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginA = new Intent(MainActivity.this, login.class);
                MainActivity.this.startActivity(loginA);
                MainActivity.this.finish();
            }
        }, 2000);
    }
}