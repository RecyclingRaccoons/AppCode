/**
 * This class models the main map page's xml file content and buttons
 * @author Recycling Raccoons
 */

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MapPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

    }

    /**
     * On click method to take user to the main recycling page
     * @param v represents the map page xml file content
     */
    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the map page xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the map page xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the settings page
     * @param v represents the map page xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the map page xml file content
     */
    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

    /**
     * On click method to take user to the plastic sub-page
     * @param v represents the map page xml file content
     */
    public void plasticMap(View v) {
        Intent toPlastic = new Intent(this, PlasticMap.class);
        startActivity(toPlastic);
    }

    /**
     * On click method to take user to the paper sub-page
     * @param v represents the map page xml file content
     */
    public void paperMap(View v) {
        Intent toPaper = new Intent(this, PaperMap.class);
        startActivity(toPaper);
    }

    /**
     * On click method to take user to the metal sub-page
     * @param v represents the map page xml file content
     */
    public void metalMap(View v) {
        Intent toMetal = new Intent(this, MetalMap.class);
        startActivity(toMetal);
    }

    /**
     * On click method to take user to the glass sub-page
     * @param v represents the map page xml file content
     */
    public void glassMap(View v) {
        Intent toGlass = new Intent(this, GlassMap.class);
        startActivity(toGlass);
    }
}

