package com.example.myapplication;



import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
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


public class CameraPage extends AppCompatActivity {

    ImageButton camera;
    ImageButton gallery;
    ImageView displayer;
    Button cancel;
    Button accept;

    private static final int PERM_CODE = 101;
    private static final int REQUEST_CODE = 102;

    //Follow camera tutorial:
    //https://www.youtube.com/watch?v=zeI0M9PtOBA
    //https://www.youtube.com/watch?v=s1aOlr3vbbk


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_page);

        camera = findViewById(R.id.cameraOption);
        displayer = findViewById(R.id.imgDisplayer);
        gallery = findViewById(R.id.imgOption);
        cancel = findViewById(R.id.cancelButton);
        accept = findViewById(R.id.nextButton);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askCameraPermissions();
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

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

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void askCameraPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, PERM_CODE);
        }
        else {
            openCamera();
        }
    }

    @Override
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

    private void openCamera() {
        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cam, REQUEST_CODE);
    }

    @Override
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
    }

    public void toHomePage (View v){
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void recyclingMainPage (View v){
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }

    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }
}
