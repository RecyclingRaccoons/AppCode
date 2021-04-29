package com.example.myapplication;



import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class CameraPage extends AppCompatActivity {

    ImageButton camera;
    ImageButton gallery;
    ImageView displayer;

    private static final int REQUEST_CODE = 101;

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

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askCameraPermissions();
                Intent cam = new Intent();
                cam.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cam);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void askCameraPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, REQUEST_CODE);
        }
        else {
            //openCamera();
        }
    }

    @Override
    public void onRequestPermissionsResult (int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
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

    // Context context = getApplicationContext();
    //        CharSequence text = "Hello toast!";
    //        int duration = Toast.LENGTH_SHORT;
    //
    //        Toast toast = Toast.makeText(context, text, duration);
    //        toast.show();
    //
    //        Intent img_accept = new Intent(this, ImageAcceptance.class);
    //        startActivity(img_accept);
}
