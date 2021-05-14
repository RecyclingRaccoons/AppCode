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

    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    public void mapPage(View v) {
        Intent toMap = new Intent(this, SettingsPage.class);
        startActivity(toMap);
    }

}