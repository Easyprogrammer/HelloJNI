package com.ucpaas.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTest = (TextView) findViewById(R.id.text);
        mTest.setText(HelloJni.getFromCString());
        //功能1
        //功能2
        //master feature-1
    }
}
