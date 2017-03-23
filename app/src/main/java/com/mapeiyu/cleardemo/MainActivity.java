package com.mapeiyu.cleardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.UsageStatsEvent;


public class MainActivity extends AppCompatActivity {

    @UsageStatsEvent(page="MainActivity", name = "onCreate")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @UsageStatsEvent(page="MainActivity", name = "onStart")
    @Override
    protected void onStart() {
        super.onStart();
    }

    @UsageStatsEvent(page="MainActivity", name = "onStop")
    @Override
    protected void onStop() {
        super.onStop();
    }
}
