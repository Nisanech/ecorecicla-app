package com.example.ecorecicla_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button btn_layout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btn_layout = findViewById(R.id.irLayout);
    btn_layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentIr = new Intent(MainActivity.this, PantallaPrincipal.class);
                startActivity(intentIr);
            }
    });

  }
}