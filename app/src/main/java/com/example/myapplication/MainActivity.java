package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridLayout root = new GridLayout(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(params);
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setBackgroundColor(Color.LTGRAY);
        TextView num = new TextView(this);
        num.setText("Test 1");
        num.setTextSize(24);
        num.setBackgroundColor(Color.GRAY);
        root.addView(num);
        setContentView(root);


        // Set content view by XML
        //setContentView(R.layout.activity_main);
    }
}
