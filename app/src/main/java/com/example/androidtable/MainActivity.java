package com.example.androidtable;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout root = new GridLayout(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(params);
        root.setPadding(20, 20, 20, 20);
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setBackgroundColor(Color.GREEN);
        root.setColumnCount(2);
        root.setRowCount(2);

        TextView num = new TextView(this);
        num.setText("Text 1");
        num.setTextSize(24);
        num.setBackgroundColor(Color.GRAY);
        root.addView(num);
        setContentView(root);


        // Set content view by XML
        //setContentView(R.layout.activity_main);
    }
}
