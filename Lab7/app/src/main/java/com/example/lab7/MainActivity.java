package com.example.lab7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        EditText et = findViewById(R.id.editTextNumber);
        TextView tv = findViewById(R.id.textView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(et.getText().toString());
                String res= "";
                for (int i=1;i<=10;i++) {
                    res += i +" x "+n+" = "+(i*n)+ "\n";
                }
                tv.setText(res);
            }
        });
    }
}