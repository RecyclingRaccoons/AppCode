/**
 * This class controls the recycling importance page
 * @author Recycling Raccoons
 */
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

        /**
         * Controls the functions of the landfill circle button in the environmental impact infographic
         */
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

        /**
         * Controls the functions of the incinerator circle button in the environmental impact infographic
         */
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

        /**
         * Controls the functions of the natural resources circle button in the environment impact infographic
         */
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

        /**
         * Controls the function of the energy circle button in the environmental impact infographic
         */
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

        /**
         * Controls the function of the "x" button for the environmental impact infographic
         */
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

        /**
         * Controls the function of the circular economy button in the economic impact infographic
         */
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

        /**
         * Controls the function of the recycling jobs button in the economic impact infographic
         */
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

        /**
         * Controls the function of the "x" button in the economic impact infographic
         */
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

        /**
         * Controls the functions of the recycling collection button in the recycling process infographic
         */
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

        /**
         * Controls the functions of the cleaning button in the recycling process infographic
         */
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

        /**
         * Controls the functions of the manufacturing button in the recycling process infographic
         */
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

        /**
         * Controls the functions of the new product button in the recycling process infographic
         */
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

        /**
         * Controls the functions of the "x" button in the recycling process infographic
         */
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

    /**
     * Opens the recycling main page
     * @param v represents the camera xml file
     */
    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    /**
     * Opens the home page
     * @param v represents the camera xml file
     */
    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
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
    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }
}
