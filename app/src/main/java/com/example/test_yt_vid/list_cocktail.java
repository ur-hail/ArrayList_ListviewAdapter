package com.example.test_yt_vid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class list_cocktail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cocktail);

        ListView list = (ListView) findViewById(R.id.list_screen_2);
        ArrayList<String> cocktaillijst = getIntent().getStringArrayListExtra("CocktailList");

        for (String s : cocktaillijst){
            Log.d("My array list content: ", s);
        }
       list.setAdapter((new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,cocktaillijst)));
    }
}
