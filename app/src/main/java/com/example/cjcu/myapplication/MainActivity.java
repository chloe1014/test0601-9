package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] fruit = {"Apple","Pineapple","Banana","Kiwi","A","B","C","D","E","F","ggg","hhh","iii"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // final ListView list = (ListView) findViewById(R.id.list);
        final Spinner spinner =(Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        ArrayAdapter adapter1= new ArrayAdapter(this,android.R.layout.simple_spinner_item,fruit);

       // list.setAdapter(adapter);
        spinner.setAdapter(adapter1);

        //list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //@Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(MainActivity.this,list.getItemAtPosition(position).toString() , Toast.LENGTH_SHORT).show();
           // }
       // });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, spinner.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
