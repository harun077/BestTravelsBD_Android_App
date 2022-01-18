package com.ariyan.besttravelsbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SylhetActivity extends AppCompatActivity {
    Button bisanakanddi, jaflong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        bisanakanddi = findViewById(R.id.bisanakanddi);
        jaflong = findViewById(R.id.jaflong);

        bisanakanddi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SylhetActivity.this, BisanaKanddi.class);
                startActivity(intent);
            }
        });

        jaflong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SylhetActivity.this, Jaflong.class);
                startActivity(intent);
            }
        });

    }
}