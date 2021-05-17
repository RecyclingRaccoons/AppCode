package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsPage extends AppCompatActivity {

    private SwitchMaterial camera;
    private static final int CAMERA_PERMISSION_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        camera = findViewById(R.id.switch1);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
            }
        });
    }

    public void checkPermission(String permission, int requestCode)
    {
        // Checking if permission is not granted
        if (ContextCompat.checkSelfPermission(SettingsPage.this, permission) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(SettingsPage.this, new String[] { permission }, requestCode);
        }
        else {
            Toast.makeText(SettingsPage.this, "Permission already granted", Toast.LENGTH_SHORT).show();
        }
    }

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
        }
    }

    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

}