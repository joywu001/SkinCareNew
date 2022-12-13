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

public class Skin_FuncProd extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.func_prod);
    }

    public void func_toner(View view) {
        Intent intent = new Intent(this, Func_toner.class);
        startActivity(intent);
    }

    public void func_essence(View view) {
        Intent intent = new Intent(this, Func_Essence.class);
        startActivity(intent);
    }

    public void func_lotion(View view) {
        Intent intent = new Intent(this, Func_lotion.class);
        startActivity(intent);
    }

    public void func_cream(View view) {
        Intent intent = new Intent(this, Func_cream.class);
        startActivity(intent);
    }

    public void func_eyeCream(View view) {
        Intent intent = new Intent(this, Func_eyeCream.class);
        startActivity(intent);
    }

    public void func_mask(View view) {
        Intent intent = new Intent(this, Func_mask.class);
        startActivity(intent);
    }
}