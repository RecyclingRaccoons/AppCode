package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecyclingCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling_categories);
    }

    public void exitToHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    public void toPaperPage(View v) {
        Intent toPaper = new Intent(this, PaperPage.class);
        startActivity(toPaper);
    }

}