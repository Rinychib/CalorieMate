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



public class Drink extends AppCompatActivity {
    HashMap<String, String> nameDrink = new HashMap<>();

    ListView drinklist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int calorieCount = extras.getInt("key");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int count = 0;


        ListView drinkList = (ListView) findViewById(R.id.drink_list);


        nameDrink.put("Coke", "\n\n150");
        nameDrink.put("Mountain Dew", "\n\n170");
        nameDrink.put("Unsweetened Tea", "\n\n2");
        nameDrink.put("Sweetened Tea", "\n\n77");
        nameDrink.put("Milk 2%", "\n\n103");
        nameDrink.put("Coffee", "\n\n1");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        Iterator it = nameDrink.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);

        }
        drinkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent drinkIntent = new Intent(getBaseContext(), Drink.class);
                drinkIntent.putExtra("DRINK_CHOICE", position);
            }
    });}
}

        //drinklist = (ListView)findViewById(R.id.drink_list); Not used anymore

        //This is from an old iteration that did not allow me to have sub items in the list.
        /*
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
*/





