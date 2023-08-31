package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickFindBeer(View view) {
        try {
            TextView brands = findViewById(R.id.brands);
            Spinner color = findViewById(R.id.color);
            String beerType = String.valueOf(color.getSelectedItem());
            brands.setText(beerType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


