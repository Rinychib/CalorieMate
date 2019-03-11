package com.example.caloriemate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Drink extends AppCompatActivity {


    ListView drinklist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        drinklist = (ListView)findViewById(R.id.drink_list);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Coke             X");
        arrayList.add("Mountain Dew     X");
        arrayList.add("Unsweetened Tea  X");
        arrayList.add("Sweetened Tea    X");
        arrayList.add("Milk 2%          X");
        arrayList.add("Coffee           X");
        arrayList.add("Beer             X");
        arrayList.add("Wine             X");
        arrayList.add("Soylent          X");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        drinklist.setAdapter(arrayAdapter1);

        drinklist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Drink.this,"Chosen Drink: " + arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();

            }
        });

        }
    }

