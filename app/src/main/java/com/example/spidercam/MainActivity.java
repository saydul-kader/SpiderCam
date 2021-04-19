package com.example.spidercam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent dashIntent = new Intent(MainActivity.this,Dashboard.class);
        SystemClock.sleep(3000);
        startActivity(dashIntent);
        finish();
    }
}