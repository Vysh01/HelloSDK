package com.thecodecity.ekflash;

import android.content.Context;
import android.widget.Toast;

public class Messager {
    public static void show(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}
