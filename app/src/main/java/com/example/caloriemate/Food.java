package com.example.caloriemate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Food extends AppCompatActivity {


    ListView foodlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int calorieCount = extras.getInt("key");
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int count = 0;

        ListView foodList = (ListView) findViewById(R.id.food_list);

        HashMap<String, String> nameFood = new HashMap<>();
        nameFood.put("Burger", "\n\n354");
        nameFood.put("Fries", "\n\n365");
        nameFood.put("Hotdog", "\n\n151");
        nameFood.put("Banana", "\n\n105");
        nameFood.put("Orange", "\n\n45");
        nameFood.put("Steak", "\n\n679");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
            new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

            Iterator it = nameFood.entrySet().iterator();
            while (it.hasNext())
            {
                HashMap<String, String> resultsMap = new HashMap<>();
                Map.Entry pair = (Map.Entry)it.next();
                resultsMap.put("First Line", pair.getKey().toString());
                resultsMap.put("Second Line", pair.getValue().toString());
                listItems.add(resultsMap);

            }
        foodList.setAdapter(adapter);

        Intent i = new Intent(Food.this, HomeActivity.class);

    }
}

    //foodlist = (ListView) findViewById(R.id.food_list); Old declaration

     //This is from an earlier iteration that did not allow me to add sub items.
      /*  final ArrayList<String> arrayList = new ArrayList<>();

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
*/