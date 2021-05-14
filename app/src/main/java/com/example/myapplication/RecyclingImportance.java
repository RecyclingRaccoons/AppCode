package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecyclingImportance extends AppCompatActivity {

    ViewGroup tContainer;

    TextView landfill;
    TextView incinerator;
    TextView resources;
    TextView energy;
    Button landfillB;
    Button incineratorB;
    Button resourcesB;
    Button energyB;
    ImageButton exit;

    TextView circular;
    TextView jobs;
    Button circularB;
    Button jobsB;
    ImageButton exit2;

    TextView collection;
    TextView cleaning;
    TextView manufacturing;
    TextView newProduct;
    Button collectionB;
    Button cleaningB;
    Button manufacturingB;
    Button newProductB;
    ImageButton exit3;


    // Hidden text tutorial: https://www.youtube.com/watch?v=qj3kKB71u84

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling_importance);

        tContainer = findViewById(R.id.transitionContainer);
        landfill = findViewById(R.id.landfillInfo);
        landfillB = findViewById(R.id.landfill);
        exit = findViewById(R.id.exitBox);

        landfillB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                landfill.setVisibility(View.VISIBLE);
                landfillB.setVisibility(View.GONE);
                incineratorB.setVisibility(View.GONE);
                resourcesB.setVisibility(View.GONE);
                energyB.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
            }
        });

        incinerator = findViewById(R.id.incineratorInfo);
        incineratorB = findViewById(R.id.incinerator);

        incineratorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                incinerator.setVisibility(View.VISIBLE);
                landfillB.setVisibility(View.GONE);
                incineratorB.setVisibility(View.GONE);
                resourcesB.setVisibility(View.GONE);
                energyB.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
            }
        });

        resources = findViewById(R.id.resourcesInfo);
        resourcesB = findViewById(R.id.resources);

        resourcesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                resources.setVisibility(View.VISIBLE);
                landfillB.setVisibility(View.GONE);
                incineratorB.setVisibility(View.GONE);
                resourcesB.setVisibility(View.GONE);
                energyB.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
            }
        });

        energy = findViewById(R.id.energyInfo);
        energyB = findViewById(R.id.energy);

        energyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                energy.setVisibility(View.VISIBLE);
                landfillB.setVisibility(View.GONE);
                incineratorB.setVisibility(View.GONE);
                resourcesB.setVisibility(View.GONE);
                energyB.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                landfill.setVisibility(View.GONE);
                incinerator.setVisibility(View.GONE);
                resources.setVisibility(View.GONE);
                energy.setVisibility(View.GONE);
                landfillB.setVisibility(View.VISIBLE);
                incineratorB.setVisibility(View.VISIBLE);
                resourcesB.setVisibility(View.VISIBLE);
                energyB.setVisibility(View.VISIBLE);
                exit.setVisibility(View.GONE);
            }
        });

        circular = findViewById(R.id.circularEconInfo);
        circularB = findViewById(R.id.circularEcon);
        exit2 = findViewById(R.id.exitBox2);

        circularB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                circular.setVisibility(View.VISIBLE);
                circularB.setVisibility(View.GONE);
                jobsB.setVisibility(View.GONE);
                exit2.setVisibility(View.VISIBLE);
            }
        });

        jobs = findViewById(R.id.jobsInfo);
        jobsB = findViewById(R.id.jobs);

        jobsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                jobs.setVisibility(View.VISIBLE);
                circularB.setVisibility(View.GONE);
                jobsB.setVisibility(View.GONE);
                exit2.setVisibility(View.VISIBLE);
            }
        });

        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                circular.setVisibility(View.GONE);
                jobs.setVisibility(View.GONE);
                circularB.setVisibility(View.VISIBLE);
                jobsB.setVisibility(View.VISIBLE);
                exit2.setVisibility(View.GONE);
            }
        });

        collection = findViewById(R.id.collectionInfo);
        collectionB = findViewById(R.id.collection);
        cleaning = findViewById(R.id.cleaningInfo);
        cleaningB = findViewById(R.id.cleaning);
        manufacturing = findViewById(R.id.manufacturingInfo);
        manufacturingB = findViewById(R.id.manufacturing);
        newProduct = findViewById(R.id.newProductInfo);
        newProductB = findViewById(R.id.newProduct);
        exit3 = findViewById(R.id.exitBox3);

        collectionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                collection.setVisibility(View.VISIBLE);
                collectionB.setVisibility(View.GONE);
                cleaningB.setVisibility(View.GONE);
                manufacturingB.setVisibility(View.GONE);
                newProductB.setVisibility(View.GONE);
                exit3.setVisibility(View.VISIBLE);
            }
        });

        cleaningB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                cleaning.setVisibility(View.VISIBLE);
                collectionB.setVisibility(View.GONE);
                cleaningB.setVisibility(View.GONE);
                manufacturingB.setVisibility(View.GONE);
                newProductB.setVisibility(View.GONE);
                exit3.setVisibility(View.VISIBLE);
            }
        });

        manufacturingB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                manufacturing.setVisibility(View.VISIBLE);
                collectionB.setVisibility(View.GONE);
                cleaningB.setVisibility(View.GONE);
                manufacturingB.setVisibility(View.GONE);
                newProductB.setVisibility(View.GONE);
                exit3.setVisibility(View.VISIBLE);
            }
        });

        newProductB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                newProduct.setVisibility(View.VISIBLE);
                collectionB.setVisibility(View.GONE);
                cleaningB.setVisibility(View.GONE);
                manufacturingB.setVisibility(View.GONE);
                newProductB.setVisibility(View.GONE);
                exit3.setVisibility(View.VISIBLE);
            }
        });

        exit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                collection.setVisibility(View.GONE);
                cleaning.setVisibility(View.GONE);
                manufacturing.setVisibility(View.GONE);
                newProduct.setVisibility(View.GONE);
                collectionB.setVisibility(View.VISIBLE);
                cleaningB.setVisibility(View.VISIBLE);
                manufacturingB.setVisibility(View.VISIBLE);
                newProductB.setVisibility(View.VISIBLE);
                exit3.setVisibility(View.GONE);
            }
        });

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
