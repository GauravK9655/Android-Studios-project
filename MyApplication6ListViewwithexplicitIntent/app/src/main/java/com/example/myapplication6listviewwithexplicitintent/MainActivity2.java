package com.example.myapplication6listviewwithexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    String[] details= {"Gaurav Keshari","+918928660954","gaurav.keshari138@nmims.edu.in","BTech(AI & DS)","STME","NMIMS,Navi Mumbai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lv1=(ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> aad= new ArrayAdapter<>(MainActivity2.this,R.layout.listview_textview,details);
        lv1.setAdapter(aad);


        
       lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==0){
                   Toast.makeText(MainActivity2.this, "Name Clicked", Toast.LENGTH_SHORT).show();
               }
               else if(i==1){
                   Toast.makeText(MainActivity2.this, "Phone Number Clicked", Toast.LENGTH_SHORT).show();
               }
               else if(i==2){
                   Toast.makeText(MainActivity2.this, "Email Clicked", Toast.LENGTH_SHORT).show();
               }
               else if(i==3){
                   Toast.makeText(MainActivity2.this, "Course Clicked", Toast.LENGTH_SHORT).show();
               }
               else if (i==4) {
                   Toast.makeText(MainActivity2.this, "College details Clicked", Toast.LENGTH_SHORT).show();
               }
               else if(i==5){
                   Toast.makeText(MainActivity2.this, "Campus detail Clicked", Toast.LENGTH_SHORT).show();
               }
           }
       });

    }
}