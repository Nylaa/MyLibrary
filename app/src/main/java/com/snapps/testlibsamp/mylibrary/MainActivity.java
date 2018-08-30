package com.snapps.testlibsamp.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.snapps.testlibsamp.printlib.PrintClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintClass.print(this);
    }
}
