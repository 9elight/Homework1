package com.delight.homework1;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.YYZ);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout = findViewById(R.id.darkLayout);
                constraintLayout.setBackgroundColor(Color.parseColor("#EB5628"));
                textView = findViewById(R.id.bt);
                textView.setTextColor(Color.GREEN);
                textView = findViewById(R.id.Remaining);
                textView.setTextColor(Color.GREEN);
                textView = findViewById(R.id.time2);
                textView.setTextColor(Color.GREEN);
                textView = findViewById(R.id.flyTime);
                textView.setTextColor(Color.GREEN);
            }


        });
        textView = findViewById(R.id.LHR);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout = findViewById(R.id.yellowLayout);
                constraintLayout.setBackgroundColor(Color.parseColor("#004907"));
                textView = findViewById(R.id.flight);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.gate);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.group);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.seat);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.val1);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.val2);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.val3);
                textView.setTextColor(Color.WHITE);
                textView = findViewById(R.id.val4);
                textView.setTextColor(Color.WHITE);
            }
        });

        textView = findViewById(R.id.business);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = findViewById(R.id.YYZ);
                textView.setText("BISH");
                textView = findViewById(R.id.LHR);
                textView.setText("ALM");
            }
        });

    }



}
