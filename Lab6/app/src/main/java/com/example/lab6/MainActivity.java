package com.example.lab6;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        ConstraintLayout cl= findViewById(R.id.main);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cl.setBackgroundColor(Color.GRAY);
            }
        });
    }
}