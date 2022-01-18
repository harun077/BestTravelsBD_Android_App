package com.ariyan.besttravelsbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Division extends AppCompatActivity {

    CardView sylhet, chittagong, barishal, dhaka, khulna, rangpur, rajshahi, mymenshingh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        sylhet = findViewById(R.id.sylhet);
        chittagong = findViewById(R.id.chittagong);
        barishal = findViewById(R.id.barishal);
        dhaka = findViewById(R.id.dhaka);
        khulna = findViewById(R.id.khulna);
        rangpur = findViewById(R.id.rangpur);
        rajshahi = findViewById(R.id.rajshahi);
        mymenshingh = findViewById(R.id.mymenshingh);

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, SylhetActivity.class);
                startActivity(intent);
            }
        });
        chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, ChittagongActivity.class);
                startActivity(intent);
            }
        });
        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, BarishalActivity.class);
                startActivity(intent);
            }
        });
        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, DhakhaActivity.class);
                startActivity(intent);
            }
        });
        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, KhulnaActivity.class);
                startActivity(intent);
            }
        });
        rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, RangpurActivity.class);
                startActivity(intent);
            }
        });
        rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, RajshahiActivity.class);
                startActivity(intent);
            }
        });
        mymenshingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(Division.this, MymenshinghActivity.class);
                startActivity(intent);
            }
        });

    }
}