package com.example.lab9;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rm = findViewById(R.id.radioButton);
        RadioButton rf = findViewById(R.id.radioButton2);
        TextView t = findViewById(R.id.textView2);
        RadioGroup rg = findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rm.isChecked())
                    t.setText("You are a Man");
                if(rf.isChecked())
                    t.setText("You are a Woman");
            }
        });
    }
}