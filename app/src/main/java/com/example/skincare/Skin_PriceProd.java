package com.example.skincare;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class Skin_PriceProd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_prod);
    }
    public void price_cheap(View view) {
        Intent intent = new Intent(this, price_cheap.class);
        startActivity(intent);
    }

    public void price_doctor(View view) {
        Intent intent = new Intent(this, price_doctor.class);
        startActivity(intent);
    }

    public void price_expensive(View view) {
        Intent intent = new Intent(this, price_expensive.class);
        startActivity(intent);
    }
}