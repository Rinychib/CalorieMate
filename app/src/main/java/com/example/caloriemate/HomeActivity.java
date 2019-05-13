package com.example.caloriemate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    public static String EXTRA_NUMBER = "0";
    private Button food_button;
    private Button drink_button;
    int calorieNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent foodPass = new Intent(HomeActivity.this, Food.class);
        Intent drinkPass = new Intent(HomeActivity.this, Drink.class);
        foodPass.putExtra("key", calorieNumber);


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

    String calorieget = getIntent().getStringExtra("FOOD_CHOICE");
    int result = Integer.parseInt(calorieget);
    int calorieNumber = calorieNumber + result;

    public void openfood(){
        Intent intent = new Intent(this, Food.class);
        intent.putExtra(EXTRA_NUMBER, calorieNumber);
        startActivity(intent);
    }

    public void opendrink(){
        Intent intent = new Intent(this, Drink.class);
        startActivity(intent);
    }

    public void setcalorie(int x){
        TextView caloriecount = (TextView) findViewById(R.id.calorieCount);
        caloriecount.setText(x + "Calories");
    }
}
