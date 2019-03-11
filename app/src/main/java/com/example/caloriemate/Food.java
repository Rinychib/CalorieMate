package com.example.caloriemate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Food extends AppCompatActivity {


    ListView foodlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        foodlist = (ListView) findViewById(R.id.food_list);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Burger             X");
        arrayList.add("Fries              X");
        arrayList.add("Hotdog             X");
        arrayList.add("Banana             X");
        arrayList.add("Orange             X");
        arrayList.add("Granola Bar        X");
        arrayList.add("Steak              X");
        arrayList.add("Chicken Nuggets    X");
        arrayList.add("Ice Cream          X");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        foodlist.setAdapter(arrayAdapter);

        foodlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Food.this, "Chosen Drink: " + arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();


            }
        });
    }}
