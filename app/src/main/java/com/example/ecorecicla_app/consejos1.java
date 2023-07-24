package com.example.ecorecicla_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class consejos1 extends AppCompatActivity {

    private TextView textViewConsejos;
    private TextView textViewTip1;
    private TextView textViewTip2;
    private TextView textViewTip3;
    private TextView textViewNumero1;
    private TextView textViewNumero2;
    private TextView textViewNumero3;
    private TextView textViewItem1;
    private TextView textViewItem2;
    private TextView textViewItem3;
    private TextView textViewSabes2;
    private TextView textViewSabias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consejos1);

        // TextViews
        textViewConsejos = findViewById(R.id.consejos);
        textViewTip1 = findViewById(R.id.Tip1);
        textViewTip2 = findViewById(R.id.Tip2);
        textViewTip3 = findViewById(R.id.tip3);
        textViewNumero1 = findViewById(R.id.numero1);
        textViewNumero2 = findViewById(R.id.numero2);
        textViewNumero3 = findViewById(R.id.numero3);
        textViewItem1 = findViewById(R.id.item1);
        textViewItem2 = findViewById(R.id.item2);
        textViewItem3 = findViewById(R.id.item3);
        textViewSabes2 = findViewById(R.id.sabes2);
        textViewSabias = findViewById(R.id.sabias);

    }
}
