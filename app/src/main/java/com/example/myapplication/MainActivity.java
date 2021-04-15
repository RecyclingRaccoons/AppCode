package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Raccoons are cool
        // Hello

        // hola this is kasia
    }

    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    public void recyclingMainPage2(View v) {
        Intent intent2 = new Intent(this, RecyclingImportance.class);
        startActivity(intent2);
    }

    public void aboutUsPage(View v) {
        Intent intentToAboutUs = new Intent(this, AboutUsPage.class);
        startActivity(intentToAboutUs);
    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

}