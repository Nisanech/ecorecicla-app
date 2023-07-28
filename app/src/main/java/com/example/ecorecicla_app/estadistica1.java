package com.example.ecorecicla_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class estadistica1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos1);

        // TextView que queremos subrayar
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView desdeTextView = findViewById(R.id.desde);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView hastaTextView = findViewById(R.id.hasta2);;

        // Subrayamos el texto
        underlineText(desdeTextView);
        underlineText(hastaTextView);
    }

    // Función para subrayar un TextView
    private void underlineText(TextView textView) {
        String text = textView.getText().toString();
        SpannableString content = new SpannableString(text);
        content.setSpan(new UnderlineSpan(), 0, content.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(content);
    }
}
