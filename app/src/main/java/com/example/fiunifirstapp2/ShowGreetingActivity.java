package com.example.fiunifirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_greeting);

        final TextView textView = (TextView) findViewById(R.id.textViewGreeting);
        final Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        textView.setText("Hola " + name + "!");
    }
}