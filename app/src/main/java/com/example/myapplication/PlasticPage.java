package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlasticPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic_page);
    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    public void category1Page(View v) {
        Intent toCategory1 = new Intent(this, Category_1.class);
        startActivity(toCategory1);
    }

    public void category2Page(View v) {
        Intent toCategory2 = new Intent(this, Category_1.class);
        startActivity(toCategory2);
    }

    public void category3Page(View v) {
        Intent toCategory3 = new Intent(this, Category_1.class);
        startActivity(toCategory3);
    }

    public void category4Page(View v) {
        Intent toCategory4 = new Intent(this, Category_1.class);
        startActivity(toCategory4);
    }

    public void category5Page(View v) {
        Intent toCategory5 = new Intent(this, Category_1.class);
        startActivity(toCategory5);
    }

    public void category6Page(View v) {
        Intent toCategory6 = new Intent(this, Category_1.class);
        startActivity(toCategory6);
    }

    public void category7Page(View v) {
        Intent toCategory7 = new Intent(this, Category_1.class);
        startActivity(toCategory7);
    }

}