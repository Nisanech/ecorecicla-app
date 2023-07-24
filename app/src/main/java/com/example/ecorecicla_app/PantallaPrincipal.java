package com.example.ecorecicla_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends AppCompatActivity {


    Button btnCategoria;
    Button btnEstadistica;
    Button btnConsejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        btnCategoria = findViewById(R.id.btnCategorias);
        btnEstadistica = findViewById(R.id.btnEstadisticas);
        btnConsejo = findViewById(R.id.btnConsejos);

        btnCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCategoria = new Intent(PantallaPrincipal.this, IntroActivity.class);
                startActivity(intentCategoria);
            }
        });


        btnEstadistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEstadistic = new Intent(PantallaPrincipal.this, IntroActivity.class);
                startActivity(intentEstadistic);
            }

        });

        btnConsejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentConsejo = new Intent(PantallaPrincipal.this, IntroActivity.class);
                startActivity(intentConsejo);
            }
        });

    }
}