package com.example.ecorecicla_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomappbar.BottomAppBar;

public class InicioSesion extends AppCompatActivity {

    EditText etMail;
    EditText etPassword;
    Button btnEntrar;
    Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        etMail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPass);
        btnEntrar = findViewById(R.id.btn_start);
        btnRegistrar = findViewById(R.id.btn_register);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle enviaDados = new Bundle();
                enviaDados.putString("KeyDatos",etMail.getText().toString());
                Intent intent = new Intent(InicioSesion.this, PantallaPrincipal.class);
                intent.putExtras(enviaDados);
                startActivity(intent);
            }
        });

    }
}