package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard report = new ReportCard("Robert", 10, 100, 20, 40);
        Log.i("MainActivity", report.toString());
        report.setComputersGrade(-100);
        Log.i("MainActivity", report.toString());
    }
}
