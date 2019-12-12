package com.example.faturapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daire);

        Intent intent = getIntent();
        String str = intent.getStringExtra(MainActivity.name);
        TextView daireText= findViewById(R.id.daireText);
        daireText.setText(str);



    }
}
