package com.example.myapplication;
/**
 * This class controls the camera page and the camera features of the app
 * @author Recycling Raccoons
 */


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;


public class CameraPage extends AppCompatActivity {

    ImageButton camera;
    ImageButton gallery;
    ImageView displayer;
    Button cancel;
    Button cancel2;
    Button accept;

    private static final int PERM_CODE = 101;
    private static final int REQUEST_CODE = 102;
    private static final int SELECT_FILE = 103;


    //Follow camera tutorial:
    //https://www.youtube.com/watch?v=s1aOlr3vbbk

    //Followed gallery tutorial
    //https://www.youtube.com/watch?v=i5UcFAdKe5M

    //How to rotate an ImageView
    //https://stackoverflow.com/questions/8981845/android-rotate-image-in-imageview-by-an-angle


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_page);

        camera = findViewById(R.id.cameraOption);
        displayer = findViewById(R.id.imgDisplayer);
        gallery = findViewById(R.id.imgOption);
        cancel = findViewById(R.id.cancelButtonCam);
        cancel2 = findViewById(R.id.cancelButtonGal);
        accept = findViewById(R.id.nextButton);

        /**
         * Controls the functions of the camera image button
         */
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askCameraPermissions();
            }
        });

        /**
         *  Controls the functions of the gallery image button
         */
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                gallery.setType("image/*");
                startActivityForResult (gallery.createChooser(gallery, "Select File"), SELECT_FILE);
            }
        });

        /**
         *  Controls the functions of the cancel button when the camera button is pressed
         */
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera.setVisibility(View.VISIBLE);
                gallery.setVisibility(View.VISIBLE);
                displayer.setVisibility(View.GONE);
                cancel.setVisibility(View.GONE);
                accept.setVisibility(View.GONE);
            }
        });

        /**
         *  Controls the functions of the cancel button when the gallery button is pressed
         */
        cancel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera.setVisibility(View.VISIBLE);
                gallery.setVisibility(View.VISIBLE);
                displayer.setVisibility(View.GONE);
                cancel2.setVisibility(View.GONE);
                accept.setVisibility(View.GONE);
                displayer.setRotation(270);
            }
        });
    }

    /**
     *  Asks the user for camera permissions if they are not already enabled
     */
    private void askCameraPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, PERM_CODE);
        }
        else {
            openCamera();
        }
    }

    @Override
    /**
     * Checks if camera permissions are enabled
     * If they are, the camera is opened
     * If they aren't, a message is sent to enable permissions
     */
    public void onRequestPermissionsResult (int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
       if (requestCode == PERM_CODE) {
           if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();
           }
           else {
               Toast.makeText(this, "Camera Permission is Required to use the camera", Toast.LENGTH_SHORT).show();
           }
       }
    }

    /**
     * Opens the Android camera
     */
    private void openCamera() {
        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cam, REQUEST_CODE);
    }

    @Override
    /**
     * Once a picture is selected from the camera or gallery, it is displayed in an image preview that appears
     */
    protected void onActivityResult (int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            displayer.setImageBitmap(image);
            camera.setVisibility(View.GONE);
            gallery.setVisibility(View.GONE);
            displayer.setVisibility(View.VISIBLE);
            cancel.setVisibility(View.VISIBLE);
            accept.setVisibility(View.VISIBLE);
        }
        else if (requestCode == SELECT_FILE) {
            Uri selectedImg = data.getData();
            displayer.setImageURI(selectedImg);
            displayer.setRotation(90);

            camera.setVisibility(View.GONE);
            gallery.setVisibility(View.GONE);
            displayer.setVisibility(View.VISIBLE);
            cancel2.setVisibility(View.VISIBLE);
            accept.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Opens the next page (Camera question page)
     * @param v represents the camera xml files
     */
    public void nextPage (View v) {
        Intent next = new Intent(this, CameraQuestions.class);
        startActivity(next);
    }

    /**
     * Opens the home page
     * @param v represents the camera xml file
     */
    public void toHomePage (View v){
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    /**
     * Opens the recycling main page
     * @param v represents the camera xml file
     */
    public void recyclingMainPage (View v){
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    /**
     * Opens the camera page
     * @param v represents the camera xml file
     */
    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    /**
     * Opens the settings page
     * @param v represents the camera xml file
     */
    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    /**
     * Opens the map page
     * @param v represents the camera xml file
     */
    public void mapPage(View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }
}
