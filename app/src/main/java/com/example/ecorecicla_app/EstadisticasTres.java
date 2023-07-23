package com.example.ecorecicla_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EstadisticasTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_tres);
    }

    public void onHistorialClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Opción de Historial seleccionada", Toast.LENGTH_SHORT).show();
    }

    public void onPorcentajesClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Opción de Porcentajes seleccionada", Toast.LENGTH_SHORT).show();
    }

    public void onGananciasClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Opción de Ganancias seleccionada", Toast.LENGTH_SHORT).show();
    }
}