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

    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void recyclingMainPage(View v) {
        Intent toCategories = new Intent(this, RecyclingCategories.class);
        startActivity(toCategories);
    }
}
