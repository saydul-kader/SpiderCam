package com.example.spidercam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Livestream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livestream);
        WebView browser = findViewById(R.id.webview);
        //browser.getSettings().setAllowFileAccess(true);
        Intent intent = getIntent();
        String liveurl = intent.getStringExtra("url");
        browser.loadUrl(liveurl);
    }
}