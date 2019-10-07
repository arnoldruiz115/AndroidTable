package com.example.androidtable;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        root.setLayoutParams(params);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(5);
        root.setRowCount(11);

        //----------------------Set The content view by Java Code----------------------------------
        drawTable(root);
        setContentView(root);

        //----------------------Set The content view by XML Layout---------------------------------
        //setContentView(R.layout.table_main);
    }

    protected void drawTable(GridLayout root){
        drawLeftNums(root);
        drawTopRules(root);
        drawProperties(root);
        drawBlueRules(root);
        drawWhiteRule(root);
        drawYellowBlocks(root);
        drawOrangeGreeting(root);
    }

    protected void drawLeftNums(GridLayout root){
        GridLayout.Spec col_spec;
        GridLayout.Spec row_spec;
        for(int i = 0; i < 11; i++){
            TextView num = new TextView(this);
            switch (i + 1){
                case 1:
                    num.setText(R.string.num1);
                    break;
                case 2:
                    num.setText(R.string.num2);
                    break;
                case 3:
                    num.setText(R.string.num3);
                    break;
                case 4:
                    num.setText(R.string.num4);
                    break;
                case 5:
                    num.setText(R.string.num5);
                    break;
                case 6:
                    num.setText(R.string.num6);
                    break;
                case 7:
                    num.setText(R.string.num7);
                    break;
                case 8:
                    num.setText(R.string.num8);
                    break;
                case 9:
                    num.setText(R.string.num9);
                    break;
                case 10:
                    num.setText(R.string.num10);
                    break;
                case 11:
                    num.setText(R.string.num11);
                    break;
            }
            num.setTextSize(16);
            num.setTextColor(Color.BLACK);
            num.setGravity(Gravity.CENTER);
            num.setBackgroundColor(getResources().getColor(R.color.lightGray));

            row_spec = GridLayout.spec(i,1f);
            col_spec = GridLayout.spec(0, .1f);
            GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            num.setLayoutParams(cParams);

            root.addView(num);
        }
    }

    protected void drawTopRules(GridLayout root){
        GridLayout.Spec col_spec = GridLayout.spec(1, 4, 1f);
        GridLayout.Spec row_spec = GridLayout.spec(0, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);

        TextView rules = new TextView(this);
        rules.setText(R.string.rules1);
        rules.setTextSize(16);
        rules.setGravity(Gravity.CENTER);
        rules.setTextColor(Color.WHITE);
        rules.setBackgroundColor(Color.BLACK);
        rules.setLayoutParams(cParams);

        root.addView(rules);

    }

    protected void drawProperties(GridLayout root){
        GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
        GridLayout.Spec row_spec = GridLayout.spec(1, 2,1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        TextView prop = new TextView(this);
        prop.setText(R.string.properties);
        prop.setBackgroundColor(Color.WHITE);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setGravity(Gravity.CENTER);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        col_spec = GridLayout.spec(2, 2, 1f);
        row_spec = GridLayout.spec(1, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.name);
        prop.setBackgroundColor(Color.WHITE);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        col_spec = GridLayout.spec(2, 2, 1f);
        row_spec = GridLayout.spec(2, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.category);
        prop.setBackgroundColor(Color.WHITE);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        col_spec = GridLayout.spec(4, 1f);
        row_spec = GridLayout.spec(1, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.dayhour);
        prop.setBackgroundColor(Color.WHITE);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setPadding(10, 0, 0, 0);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        col_spec = GridLayout.spec(4, 1f);
        row_spec = GridLayout.spec(2, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.daytime);
        prop.setBackgroundColor(Color.WHITE);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setPadding(10, 0, 0, 0);
        prop.setLayoutParams(cParams);
        root.addView(prop);

    }

    protected void drawBlueRules(GridLayout root){
        //Rule Block
        GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
        GridLayout.Spec row_spec = GridLayout.spec(3,1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        TextView prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.rule);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //C1 Block
        col_spec = GridLayout.spec(2, 2, 1f);
        row_spec = GridLayout.spec(3, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.C1);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //A1 Block
        col_spec = GridLayout.spec(4, 1f);
        row_spec = GridLayout.spec(3, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.A1);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //Empty Blocks
        for(int i = 0; i < 2; i++){
            col_spec = GridLayout.spec(1, 1f);
            row_spec = GridLayout.spec(4+i, 1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            prop = new TextView(this);
            prop.setText(" ");
            prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
            prop.setGravity(Gravity.CENTER_HORIZONTAL);
            prop.setTextSize(16);
            prop.setLayoutParams(cParams);
            root.addView(prop);
        }

        //Min max hour block
        col_spec = GridLayout.spec(2, 2, 1f);
        row_spec = GridLayout.spec(4, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.minmax);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //System print block

        col_spec = GridLayout.spec(4, 1f);
        row_spec = GridLayout.spec(4, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.systemout);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //int min max blocks

        col_spec = GridLayout.spec(2, 2f);
        row_spec = GridLayout.spec(5, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.intmin);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        col_spec = GridLayout.spec(3, 1f);
        row_spec = GridLayout.spec(5, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.intmax);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        // Greeting Block
        col_spec = GridLayout.spec(4, 1f);
        row_spec = GridLayout.spec(5, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setText(R.string.strgreet);
        prop.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        prop.setGravity(Gravity.CENTER_HORIZONTAL);
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setLayoutParams(cParams);
        root.addView(prop);
    }

    protected void drawWhiteRule(GridLayout root){
        GridLayout.Spec col_spec;
        GridLayout.Spec row_spec;
        for(int i = 0; i < 5; i++){
            TextView num = new TextView(this);
            switch (i){
                case 0:
                    num.setText(R.string.rule);
                    num.setTypeface(null, Typeface.BOLD);
                    break;
                case 1:
                    num.setText(R.string.R10);
                    break;
                case 2:
                    num.setText(R.string.R20);
                    break;
                case 3:
                    num.setText(R.string.R30);
                    break;
                case 4:
                    num.setText(R.string.R40);
                    break;
            }
            num.setTextSize(16);
            num.setTextColor(Color.BLACK);
            num.setBackgroundColor(Color.WHITE);
            num.setPadding(10, 0, 0,0);

            row_spec = GridLayout.spec(i + 6,1f);
            col_spec = GridLayout.spec(1, .1f);
            GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            num.setLayoutParams(cParams);

            root.addView(num);
        }
    }

    protected void drawYellowBlocks(GridLayout root){
        // From Block
        GridLayout.Spec col_spec = GridLayout.spec(2, 1f);
        GridLayout.Spec row_spec = GridLayout.spec(6,1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        TextView prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.from);
        prop.setBackgroundColor(getResources().getColor(R.color.yellow));
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setPadding(10, 0, 0, 0);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //To Block
        col_spec = GridLayout.spec(3, 2f);
        row_spec = GridLayout.spec(6, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.to);
        prop.setBackgroundColor(getResources().getColor(R.color.yellow));
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setPadding(10, 0, 0, 0);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //From nums
        for(int i = 0; i < 4; i++){
            col_spec = GridLayout.spec(2, 2f);
            row_spec = GridLayout.spec(7 + i, 1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            prop = new TextView(this);
            switch (i){
                case 0:
                    prop.setText("0");
                    break;
                case 1:
                    prop.setText(R.string.num12);
                    break;
                case 2:
                    prop.setText(R.string.num18);
                    break;
                case 3:
                    prop.setText(R.string.num22);
                    break;
            }
            prop.setBackgroundColor(getResources().getColor(R.color.yellow));
            prop.setTextSize(16);
            prop.setGravity(Gravity.END);
            prop.setTextColor(Color.BLACK);
            prop.setPadding(0, 0, 10, 0);
            prop.setLayoutParams(cParams);
            root.addView(prop);
        }

        //To nums
        for(int i = 0; i < 4; i++){
            col_spec = GridLayout.spec(3, 2f);
            row_spec = GridLayout.spec(7 + i, 1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            prop = new TextView(this);
            switch (i){
                case 0:
                    prop.setText(R.string.num11);
                    break;
                case 1:
                    prop.setText(R.string.num17);
                    break;
                case 2:
                    prop.setText(R.string.num21);
                    break;
                case 3:
                    prop.setText(R.string.num23);
                    break;
            }
            prop.setBackgroundColor(getResources().getColor(R.color.yellow));
            prop.setTextSize(16);
            prop.setGravity(Gravity.END);
            prop.setTextColor(Color.BLACK);
            prop.setPadding(0, 0, 10, 0);
            prop.setLayoutParams(cParams);
            root.addView(prop);
        }

    }

    protected void drawOrangeGreeting(GridLayout root){
        // Greeting Block
        GridLayout.Spec col_spec = GridLayout.spec(4, 1f);
        GridLayout.Spec row_spec = GridLayout.spec(6,1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(2, 2, 2, 2);

        TextView prop = new TextView(this);
        prop.setTypeface(null, Typeface.BOLD);
        prop.setText(R.string.greeting);
        prop.setBackgroundColor(getResources().getColor(R.color.orange));
        prop.setTextSize(16);
        prop.setTextColor(Color.BLACK);
        prop.setPadding(10, 0, 0, 0);
        prop.setLayoutParams(cParams);
        root.addView(prop);

        //Greetings
        for(int i = 0; i < 4; i++){
            col_spec = GridLayout.spec(4, 2f);
            row_spec = GridLayout.spec(7 + i, 1f);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(2, 2, 2, 2);

            prop = new TextView(this);
            switch (i){
                case 0:
                    prop.setText(R.string.goodm);
                    break;
                case 1:
                    prop.setText(R.string.gooda);
                    break;
                case 2:
                    prop.setText(R.string.goode);
                    break;
                case 3:
                    prop.setText(R.string.goodn);
                    break;
            }
            prop.setBackgroundColor(getResources().getColor(R.color.orange));
            prop.setTextSize(16);
            prop.setTextColor(Color.BLACK);
            prop.setPadding(10, 0, 0, 0);
            prop.setLayoutParams(cParams);
            root.addView(prop);
        }
    }
}
