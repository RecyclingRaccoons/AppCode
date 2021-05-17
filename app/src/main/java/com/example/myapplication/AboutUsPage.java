/**
 * This class models the About us page's xml content and buttons
 * @author Recycling Raccoons
 */

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the About Us xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take the user to the main recycling category page
     * @param v represents the About Us xml file content
     */
    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * On click method to take the user to the camera
     * @param v represents the About us xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take the user to the accessibility settings page
     * @param v represents the About us xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take the user to the Worcester County recycling map
     * @param v represents the About us xml file content
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}