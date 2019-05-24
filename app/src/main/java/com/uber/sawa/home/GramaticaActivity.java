package com.uber.sawa.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.uber.sawa.Gramatica.ImperationActivity;
import com.uber.sawa.Gramatica.IndicativoActivity;
import com.uber.sawa.Gramatica.ModeCondicionalActivity;
import com.uber.sawa.Gramatica.SubjuntivoActivity;

import com.uber.sawa.R;

public class GramaticaActivity extends AppCompatActivity {
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramatica);
        Button indicativo;
        Button conficional;
        Button subjuntivoñ;
        Button imperativo;

        indicativo = (Button) findViewById(R.id.indicativo);
        indicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GramaticaActivity.this, IndicativoActivity.class);
                startActivity(intent);
            }
        });

        conficional = (Button) findViewById(R.id.condicional);
        conficional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GramaticaActivity.this, ModeCondicionalActivity.class);
                startActivity(intent);
            }
        });

        subjuntivoñ = (Button) findViewById(R.id.subjuntivo);
        subjuntivoñ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GramaticaActivity.this, SubjuntivoActivity.class);
                startActivity(intent);
            }
        });

        imperativo = (Button) findViewById(R.id.imperativo);
        imperativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GramaticaActivity.this, ImperationActivity.class);
                startActivity(intent);
            }
        });
    }
}
