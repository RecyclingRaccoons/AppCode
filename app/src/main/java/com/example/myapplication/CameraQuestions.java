/**
 * This class models the Camera Questions page's xml file content and buttons
 * @author Recycling Raccoons
 */

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CameraQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_questions);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the Camera Questions xml file content
     */
    public void toHomePage (View v){
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the main recycling categories page
     * @param v represents the Camera Questions xml file content
     */
    public void recyclingMainPage (View v){
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the Camera Questions xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the accessibility settings page
     * @param v represents the Camera Questions xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the Camera Questions xml file content
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}
