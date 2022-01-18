package com.ariyan.besttravelsbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChittagongActivity extends AppCompatActivity {
    Button coxsbazar, saintmartin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong);

        coxsbazar = findViewById(R.id.coxsbazar);
        saintmartin = findViewById(R.id.saintmartin);


        coxsbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChittagongActivity.this, CoxsBazar.class);
                startActivity(intent);
            }
        });
        saintmartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChittagongActivity.this, SaintMartin.class);
                startActivity(intent);
            }
        });
    }
}