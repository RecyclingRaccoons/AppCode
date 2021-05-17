/**
 * This class models the second plastic category's xml file content and buttons
 * @author Recycling Raccoons
 */

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_2);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the Category 2 xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the main recycling category page
     * @param v represents the Category 2 xml file content
     */
    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the Category 2 xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the main plastic page
     * @param v represents the Category 2 xml file content
     */
    public void toPlasticPage(View v) {
        Intent toPlastic = new Intent(this, PlasticPage.class);
        startActivity(toPlastic);
    }

    /**
     * On click method to take user to the accessibility settings page
     * @param v represents the Category 2 xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the Worcester County map page
     * @param v represents the Category 2 xml file content
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}