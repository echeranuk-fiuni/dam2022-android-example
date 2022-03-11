package com.example.fiunifirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final Button buttonGreetings = (Button) findViewById(R.id.buttonGreetings);

        buttonGreetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nameValue = editTextName.getText().toString();
                textViewTitle.setText("Hola " + nameValue + "!");
            }
        });
    }

    public void sendGreetings(View view) {
        // Obtener el texto del input
        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final String nameValue = editTextName.getText().toString();

        // Crear un intent para pasar el mensaje al segundo activity
        final Intent intent = new Intent(this, ShowGreetingActivity.class);
        intent.putExtra("name", nameValue);

        // Iniciar la segunda actividad
        startActivity(intent);
    }
}