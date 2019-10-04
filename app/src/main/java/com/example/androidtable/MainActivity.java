package com.example.androidtable;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.GREEN);
        root.setColumnCount(2);
        root.setRowCount(11);


        TextView num = new TextView(this);
        num.setText("Text 1");
        num.setTextSize(18);
        num.setBackgroundColor(Color.GRAY);

        GridLayout.Spec row_spec = GridLayout.spec(1,1f);
        GridLayout.Spec col_spec = GridLayout.spec(0, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        num.setLayoutParams(cParams);


        root.addView(num);

        TextView num2 = new TextView(this);
        num2.setText("Text 2");
        num2.setTextSize(18);
        num2.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(1, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        num2.setLayoutParams(cParams);


        root.addView(num2);


        setContentView(root);

        // Set content view by XML
        //setContentView(R.layout.activity_main);
    }

    protected void drawNums(GridLayout root){
        for(int i = 1; i < 12; i++){
            TextView num = new TextView(this);
            num.setText(Integer.toString(i));
            num.setTextSize(18);
            num.setBackgroundColor(Color.GRAY);

            GridLayout.Spec row_spec = GridLayout.spec(1,1f);
            GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
            GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(10, 10, 10, 10);
            num.setLayoutParams(cParams);


            root.addView(num);
        }
    }
}
