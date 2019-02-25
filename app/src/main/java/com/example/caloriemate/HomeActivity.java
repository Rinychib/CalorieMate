package com.example.caloriemate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button food_button;
    private Button drink_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        food_button = (Button) findViewById(R.id.food_button);
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfood();
            }
        });

        drink_button = (Button) findViewById(R.id.drink_button);
        drink_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendrink();
            }
        });
    }

    public void openfood(){
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);
    }

    public void opendrink(){
        Intent intent = new Intent(this, Drink.class);
        startActivity(intent);
    }
}