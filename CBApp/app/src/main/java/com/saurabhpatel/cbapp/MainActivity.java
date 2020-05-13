package com.saurabhpatel.cbapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.saurabhpatel.samplelib.SampleLoggerClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleLoggerClass.printMessage(this, "This is a test message from MainActivity");
    }
}
