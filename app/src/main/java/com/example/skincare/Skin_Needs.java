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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Skin_Needs extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin_needs);
    }
    public void needs_dry(View view) {
        Intent intent = new Intent(this, Needs_drySkin.class);
        startActivity(intent);
    }

    public void needs_mid(View view) {
        Intent intent = new Intent(this, Needs_midSkin.class);
        startActivity(intent);
    }

    public void needs_mix(View view) {
        Intent intent = new Intent(this, Needs_mixSkin.class);
        startActivity(intent);
    }
    public void needs_oil(View view) {
        Intent intent = new Intent(this, Needs_oilSkin.class);
        startActivity(intent);
    }

    public void price_doctor(View view) {
        Intent intent = new Intent(this, price_doctor.class);
        startActivity(intent);
    }

    public void needs_all(View view) {
        Intent intent = new Intent(this, Needs_all.class);
        startActivity(intent);
    }
}