/**
 * This class models the main activity or introduction page's xml file content and buttons
 * @author Recycling Raccoons
 */

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

    /**
     * On click method to take user to the main recycling page
     * @param v represents the main activity page xml file content
     */
    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    /**
     * On click method to take user to the recycling importance page
     * @param v represents the main activity page xml file content
     */
    public void recyclingMainPage2(View v) {
        Intent intent2 = new Intent(this, RecyclingImportance.class);
        startActivity(intent2);
    }

    /**
     * On click method to take user to the about us page
     * @param v represents the main activity page xml file content
     */
    public void aboutUsPage(View v) {
        Intent intentToAboutUs = new Intent(this, AboutUsPage.class);
        startActivity(intentToAboutUs);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the main activity page xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the main activity page xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the accessibility settings page
     * @param v represents the main activity page xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the main activity page xml file content
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

    /**
     * On click method to take user to the reference list page
     * @param v represents the main activity page xml file content
     */
    public void referencePage(View v) {
        Intent toSource = new Intent(this, References.class);
        startActivity(toSource);
    }

}