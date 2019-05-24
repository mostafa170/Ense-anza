package com.uber.sawa.Gramatica;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

import com.uber.sawa.Gramatica.conificional.CondicionalCompuestoActivity;
import com.uber.sawa.Gramatica.conificional.ConficionalSIMPLEActivity;
import com.uber.sawa.R;
import com.uber.sawa.home.EventActivity;

public class ModeCondicionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_condicional);

        Button commenzar = (Button) findViewById(R.id.CONDICIONAL_SIMPLE);
        commenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModeCondicionalActivity.this, ConficionalSIMPLEActivity.class);
                startActivity(intent);
            }
        });

        Button commenzar1 = (Button) findViewById(R.id.CONDICIONAL_COMPUESTO);
        commenzar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModeCondicionalActivity.this, CondicionalCompuestoActivity.class);
                startActivity(intent);
            }
        });
    }
}
