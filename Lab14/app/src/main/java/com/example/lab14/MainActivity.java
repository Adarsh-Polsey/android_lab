package com.example.lab14;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] str = {"Apple", "Bat", "Cat", "Data"};
        Spinner spn = findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,str);
        spn.setAdapter(adapter);
    }
}