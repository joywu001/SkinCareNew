package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Final_midSkin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_midskin);
    }
    public void skinMid(View view) {
        Intent intent = new Intent(this, Needs_midSkin.class);
        startActivity(intent);
    }
    public void BackHome(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}