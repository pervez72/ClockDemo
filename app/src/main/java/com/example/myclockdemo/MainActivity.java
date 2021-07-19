package com.example.myclockdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextClock textClock;
    private AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = findViewById(R.id.text_clockID);
        analogClock = findViewById(R.id.analog_clockId);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.analog_clockId) {
            Toast.makeText(MainActivity.this, "Analog_clock", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.text_clockID) {
            Toast.makeText(MainActivity.this, "Text_Clock", Toast.LENGTH_SHORT).show();

        }
    }
}