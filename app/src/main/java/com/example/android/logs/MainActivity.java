package com.example.android.logs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView tv1 = (TextView) findViewById(R.id.menu_item_1);
        Log.v(String.valueOf(tv1.getId()), tv1.getText().toString());

        // Find second menu item TextView and print the text to the logs
        TextView tv2 = (TextView) findViewById(R.id.menu_item_2);
        Log.v(String.valueOf(tv2.getId()), tv2.getText().toString());

        // Find third menu item TextView and print the text to the logs
        TextView tv3 = (TextView) findViewById(R.id.menu_item_3);
        Log.v(String.valueOf(tv3.getId()), tv3.getText().toString());

    }
}