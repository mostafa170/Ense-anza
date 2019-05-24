package com.uber.sawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uber.sawa.home.test.QuizActivityB2;

public class QuizMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        Button B2;
        B2 = (Button) findViewById(R.id.chatB2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizMainActivity.this, QuizActivityB2.class);
                startActivity(intent);
            }
        });
    }
}