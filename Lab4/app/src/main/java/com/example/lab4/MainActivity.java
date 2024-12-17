package com.example.lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int [] images;

        images = new int[]{R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7};
        Button b = findViewById(R.id.button);
        ConstraintLayout cs = findViewById(R.id.main);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = images.length;
                Random rd = new Random();
                int randnum = rd.nextInt(length);
                cs.setBackgroundResource(images[randnum]);
            }
        });
    }
}