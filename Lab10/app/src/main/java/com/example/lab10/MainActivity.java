package com.example.lab10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox en = findViewById(R.id.checkBox);
        CheckBox mal = findViewById(R.id.checkBox2);
        CheckBox ara = findViewById(R.id.checkBox3);
        CheckBox hin = findViewById(R.id.checkBox4);
        TextView t = findViewById(R.id.textView2);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lang = "Languages Known are ";
                if(en.isChecked())
                    lang += " English";
                if(mal.isChecked())
                    lang += " Malayalam";
                if(ara.isChecked())
                    lang += " Arabic";
                if(hin.isChecked())
                    lang += " Hindi";
                t.setText(lang);
            }
        });
     }
}