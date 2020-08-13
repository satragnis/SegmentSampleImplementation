package com.example.satragni.segmentexample2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.segment.analytics.Analytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click(View view) {
        Analytics.with(this).track("App opened clicked");
        Log.d(">>>", "onCreate: app opened");
    }
}
