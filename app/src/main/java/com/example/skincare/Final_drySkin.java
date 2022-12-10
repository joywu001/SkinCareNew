package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Final_drySkin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_dryskin);

    }
    public void skinDry(View view) {
        Intent intent = new Intent(this, Needs_drySkin.class);
        startActivity(intent);
    }
}