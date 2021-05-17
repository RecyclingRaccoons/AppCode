/**
 * This class models the main recycling category page's xml file content and buttons
 */
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

    /**
     * On click method to take user to the home page
     * @param v represents the main recycling page xml file content
     */
    public void exitToHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the main recycling page xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the main recycling page
     * @param v represents the main recycling page xml file content
     */
    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the main recycling page xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the paper category page
     * @param v represents the main recycling page xml file content
     */
    public void toPaperPage(View v) {
        Intent toPaper = new Intent(this, PaperPage.class);
        startActivity(toPaper);
    }

    /**
     * On click method to take user to the glass category page
     * @param v represents the main recycling page xml file content
     */
    public void toGlassPage(View v) {
        Intent toGlass = new Intent(this, GlassPage.class);
        startActivity(toGlass);
    }

    /**
     * On click method to take user to the plastic category page
     * @param v represents the main recycling page xml file content
     */
    public void toPlasticPage(View v) {
        Intent toPlastic = new Intent(this, PlasticPage.class);
        startActivity(toPlastic);
    }

    /**
     * On click method to take user to the metal category page
     * @param v represents the main recycling page xml file content
     */
    public void toMetalPage(View v) {
        Intent toMetal = new Intent(this, MetalPage.class);
        startActivity(toMetal);
    }

    /**
     * On click method to take user to the settings page
     * @param v represents the main recycling page xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the main recycling page xml file content
     */
    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}