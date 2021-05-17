/**
 * This class models the plastic category page's xml file content and buttons
 * @author Recycling Raccoons
 */

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

    /**
     * On click method to take user to the home page
     * @param v represents the plastic category page xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the main recycling categories page
     * @param v represents the plastic category page xml file content
     */
    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the plastic category page xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the first category page
     * @param v represents the plastic category page xml file content
     */
    public void category1Page(View v) {
        Intent toCategory1 = new Intent(this, Category_1.class);
        startActivity(toCategory1);
    }

    /**
     * On click method to take user to the second category page
     * @param v represents the plastic category page xml file content
     */
    public void category2Page(View v) {
        Intent toCategory2 = new Intent(this, Category_2.class);
        startActivity(toCategory2);
    }

    /**
     * On click method to take user to the third category page
     * @param v represents the plastic category page xml file content
     */
    public void category3Page(View v) {
        Intent toCategory3 = new Intent(this, Category_3.class);
        startActivity(toCategory3);
    }

    /**
     * On click method to take user to the fourth category page
     * @param v represents the plastic category page xml file content
     */
    public void category4Page(View v) {
        Intent toCategory4 = new Intent(this, Category_4.class);
        startActivity(toCategory4);
    }

    /**
     * On click method to take user to the fifth category page
     * @param v represents the plastic category page xml file content
     */
    public void category5Page(View v) {
        Intent toCategory5 = new Intent(this, Category_5.class);
        startActivity(toCategory5);
    }

    /**
     * On click method to take user to the sixth category page
     * @param v represents the plastic category page xml file content
     */
    public void category6Page(View v) {
        Intent toCategory6 = new Intent(this, Category_6.class);
        startActivity(toCategory6);
    }

    /**
     * On click method to take user to the seventh category page
     * @param v represents the plastic category page xml file content
     */
    public void category7Page(View v) {
        Intent toCategory7 = new Intent(this, Category_7.class);
        startActivity(toCategory7);
    }

    /**
     * On click method to take user to the settings page
     * @param v represents the plastic category page xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the plastic category page xml file content
     */
    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}