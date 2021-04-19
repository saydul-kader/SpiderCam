package com.example.spidercam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
    CardView cam1,cam2,cam3,cam4,log,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        cam1 = findViewById(R.id.cam1);
        cam2 = findViewById(R.id.cam2);
        cam3 = findViewById(R.id.cam3);
        cam4 = findViewById(R.id.cam4);
        log = findViewById(R.id.log);
        about = findViewById(R.id.about);

        cam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent streamintent = new Intent(Dashboard.this, Livestream.class);
                streamintent.putExtra("url","192.168.1.10");
                startActivity(streamintent);
            }
        });

        cam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent streamintent = new Intent(Dashboard.this, Livestream.class);
                streamintent.putExtra("url","192.168.1.9");
                startActivity(streamintent);
            }
        });

        cam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent logIntent = new Intent(Dashboard.this,ActivityLog.class);
            startActivity(logIntent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }





}