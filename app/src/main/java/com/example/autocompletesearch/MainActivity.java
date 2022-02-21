package com.example.autocompletesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actxtView;

    ArrayList<String> arrLanguages = new ArrayList<>(  );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actxtView = findViewById(R.id.actxtView);

        arrLanguages.add("C" );
        arrLanguages.add("C#" );
        arrLanguages.add("C++" );
        arrLanguages.add("Objective C" );
        arrLanguages.add("Swift" );
        arrLanguages.add("Java" );
        arrLanguages.add("Kotlin" );

        ArrayAdapter<String> acAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        actxtView.setAdapter(acAdapter);
        actxtView.setThreshold(1);

    }
}