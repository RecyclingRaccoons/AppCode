package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecyclingImportance extends AppCompatActivity {

    /*ViewGroup tContainer;
    TextView txt;
    Button magic;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling_importance);
    }

    public void recyclingImportance(View v) {
        Intent intent2 = new Intent(this, RecyclingImportance.class);
        startActivity(intent2);

        /*tContainer = findViewById(R.id.transitionContainer);
        txt = findViewById(R.id.testVisible);
        magic = findViewById(R.id.landfill);

        magic.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;
                txt.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });*/
    }

}
