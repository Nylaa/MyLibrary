package com.snapps.testlibsamp.printlib;

import android.content.Context;
import android.widget.Toast;

public class PrintClass {

    public static void print(Context context){
        Toast.makeText(context, "Print method", Toast.LENGTH_SHORT).show();
    }
}
