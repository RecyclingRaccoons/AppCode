/**
 * This class models the settings page's xml file content and buttons
 * @author Recycling Raccoons
 */

package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity {

    private Button camera;
    private Button location;
    private Button storage;

    private static final int CAMERA_PERMISSION_CODE = 100;
    private static final int LOCATION_PERMISSION_CODE = 101;
    private static final int STORAGE_PERMISSION_CODE = 102;

    // Created with assistance from https://www.geeksforgeeks.org/android-how-to-request-permissions-in-android-application/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        camera = findViewById(R.id.switch1);
        location = findViewById(R.id.switch2);
        storage = findViewById(R.id.switch3);

        /**
         * Activates the checkPermission method when the button is clicked
         */
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
            }
        });

        /**
         * Activates the checkPermission method when the button is clicked
         */
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.ACCESS_FINE_LOCATION, LOCATION_PERMISSION_CODE);
            }
        });

        /**
         * Activates the checkPermission method when the button is clicked
         */
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);
                checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);
            }
        });

    }

    /**
     * Check whether permission is granted or not. It then either requests permission or has a message
     * @param permission the specific service that needs to receive permission to be used
     * @param requestCode checks user response
     */
    public void checkPermission(String permission, int requestCode)
    {

        if (ContextCompat.checkSelfPermission(SettingsPage.this, permission) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(SettingsPage.this, new String[] { permission }, requestCode);
        }
        else {
            Toast.makeText(SettingsPage.this, "Permission already granted, access device settings to change permissions", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This methods supplies the results of permission to services being granted or denied
     * @param requestCode checks user response
     * @param permissions the specific service that needs to receive permission to be used
     * @param grantResults the final message to the user
     */
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,
                permissions,
                grantResults);

        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(SettingsPage.this, "Camera Permission Granted", Toast.LENGTH_SHORT) .show();
            }
            else {
                Toast.makeText(SettingsPage.this, "Camera Permission Denied", Toast.LENGTH_SHORT) .show();
            }
        } else if (requestCode == LOCATION_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(SettingsPage.this, "Location Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SettingsPage.this, "Location Permission Denied", Toast.LENGTH_SHORT).show();
            }
        } else if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(SettingsPage.this, "Storage Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SettingsPage.this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    /**
     * On click method to take user to the main recycling page
     * @param v represents the settings page xml file content
     */
    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    /**
     * On click method to take user to the home page
     * @param v represents the settings page xml file content
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * On click method to take user to the camera page
     * @param v represents the settings page xml file content
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * On click method to take user to the accessibility settings page
     * @param v represents the settings page xml file content
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * On click method to take user to the map page
     * @param v represents the settings page xml file content
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}