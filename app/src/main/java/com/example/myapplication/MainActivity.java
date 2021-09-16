package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Atributos vista
    private Button btnSaludar;
    private Button btnRest;
    private EditText inputText;
    private TextView resultado;

    // Atributos la logica


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludar = findViewById(R.id.btnSaludar);
        inputText = findViewById(R.id.Inputext);
        resultado = findViewById(R.id.labelResultado);
        btnRest = findViewById(R.id.btnReset);

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setVisibility(View.INVISIBLE);
                inputText.setText("");
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "¡No has escrito nada!", Toast.LENGTH_SHORT).show();
                }else{

                    resultado.setText("Hola " + inputText.getText().toString());
                    resultado.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}