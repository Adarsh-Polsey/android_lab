package com.example.lab5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        Button b1= findViewById(R.id.button);
        Button b2= findViewById(R.id.button2);
        Button b3= findViewById(R.id.button3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button){
            img.setImageResource(R.drawable.img1);
        } else if (id == R.id.button2) {
            img.setImageResource(R.drawable.img6);
        }else {
            img.setImageResource(R.drawable.img7);
        }
    }
}