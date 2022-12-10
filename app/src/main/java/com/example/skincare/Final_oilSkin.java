package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Final_oilSkin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_oilskin);
    }
    public void skinOil(View view) {
        Intent intent = new Intent(this, Needs_oilSkin.class);
        startActivity(intent);
    }
}