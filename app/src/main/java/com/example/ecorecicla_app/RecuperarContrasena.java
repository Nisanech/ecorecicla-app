package com.example.ecorecicla_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class RecuperarContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena);
    }
    private void leerCampos() {
        EditText correoEditText = findViewById(R.id.edit_text_correo);
        EditText codigoRecuperacionEditText = findViewById(R.id.edit_text_codigo_recuperacion);

        String correoIngresado = correoEditText.getText().toString();
        String codigoRecuperacion = codigoRecuperacionEditText.getText().toString();
    }
}