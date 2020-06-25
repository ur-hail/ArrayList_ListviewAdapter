package com.example.test_yt_vid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity { ;
    ListView cocktaillist;
    String[] text = {"loerm","ipsum","test","local"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new myTask().execute();

    }

    class myTask extends AsyncTask<Void,String,Void>{

        private ArrayList<String> arrayList = new ArrayList<String>();

        @Override
        protected Void doInBackground(Void... voids) {
            for(String item: text){
                publishProgress(item);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            arrayList.add(values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(MainActivity.this,"All items where added succesfull", Toast.LENGTH_SHORT).show();
            Intent goToActivity = new Intent(MainActivity.this, list_cocktail.class);
            arrayList.add("test");
            goToActivity.putStringArrayListExtra("CocktailList",arrayList);
            /*// Test ArrayList
            for (String s : arrayList){
                Log.d("My array list content:", s);
            }*/
            startActivity(goToActivity);
        }
    }
}
