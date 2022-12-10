package com.example.skincare;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Skin_FuncProd extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_func_prod);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_toner()).commit();
            navigationView.setCheckedItem(R.id.toner);
        }
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toner:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_toner()).commit();
                break;
            case R.id.essence:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_essence()).commit();
                break;
            case R.id.lotion:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_lotion()).commit();
                break;
            case R.id.cream:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_cream()).commit();
                break;
            case R.id.eyeCream:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_eyeCream()).commit();
                break;
            case R.id.mask:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_f, new Func_mask()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}