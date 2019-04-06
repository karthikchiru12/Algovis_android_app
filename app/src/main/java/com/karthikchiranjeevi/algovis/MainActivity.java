package com.karthikchiranjeevi.algovis;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {



    @SuppressLint("SetJavaScriptEnabled")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            WebView wv= (WebView)findViewById(R.id.webview);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl("file:///assets/index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }


}
