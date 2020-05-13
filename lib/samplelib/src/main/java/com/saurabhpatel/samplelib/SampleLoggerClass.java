package com.saurabhpatel.samplelib;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;

public class SampleLoggerClass {

    public static void printMessage(@NonNull Context context, @NonNull String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
