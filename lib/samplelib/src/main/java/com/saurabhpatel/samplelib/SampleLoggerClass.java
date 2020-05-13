package com.saurabhpatel.samplelib;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;

public class SampleLoggerClass {

    public static void printMessage(@NonNull Context context, @NonNull String message) {
        String overrideMessage = "From lib";
        Toast.makeText(context, overrideMessage, Toast.LENGTH_LONG).show();
    }
}
