package com.uber.sawa.Gramatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uber.sawa.Gramatica.indicativo.FuturoActivity;
import com.uber.sawa.Gramatica.indicativo.FuturoCompuestoActivity;
import com.uber.sawa.Gramatica.indicativo.PresenteDeIndicativoActivity;
import com.uber.sawa.Gramatica.indicativo.PreteritoImperfectoActivity;
import com.uber.sawa.Gramatica.indicativo.PreteritoIndefinidoActivity;
import com.uber.sawa.Gramatica.indicativo.PreteritoPerfectoActivity;
import com.uber.sawa.Gramatica.indicativo.PreteritoPluscuamperfectoActivity;
import com.uber.sawa.R;

public class IndicativoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicativo);

        Button deindicativo;
        deindicativo = (Button) findViewById(R.id.presentindicativo);
        deindicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PresenteDeIndicativoActivity.class);
                startActivity(intent);
            }
        });

        Button perfecto;
        perfecto = (Button) findViewById(R.id.Pretérito_perfecto);
        perfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PreteritoPerfectoActivity.class);
                startActivity(intent);
            }
        });

        Button indicativo;
        indicativo = (Button) findViewById(R.id.Pretérito_indefinido);
        indicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PreteritoIndefinidoActivity.class);
                startActivity(intent);
            }
        });

        Button Pretérito_imperfecto;
        Pretérito_imperfecto = (Button) findViewById(R.id.Pretérito_imperfecto);
        Pretérito_imperfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PreteritoImperfectoActivity.class);
                startActivity(intent);
            }
        });

        Button Pretérito_pluscuamperfecto;
        Pretérito_pluscuamperfecto = (Button) findViewById(R.id.Pretérito_pluscuamperfecto);
        Pretérito_pluscuamperfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PreteritoPluscuamperfectoActivity.class);
                startActivity(intent);
            }
        });

        Button Futuro;
        Futuro = (Button) findViewById(R.id.Futurosimple);
        Futuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, FuturoActivity.class);
                startActivity(intent);
            }
        });

        Button FuturoCompuesto;
        FuturoCompuesto = (Button) findViewById(R.id.Futurocompuesto);
        FuturoCompuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, FuturoCompuestoActivity.class);
                startActivity(intent);
            }
        });

    }
}