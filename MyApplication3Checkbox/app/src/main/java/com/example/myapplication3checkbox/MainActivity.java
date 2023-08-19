package com.example.myapplication3checkbox;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox cb1=(CheckBox) findViewById(R.id.cb1);
        CheckBox cb2=(CheckBox) findViewById(R.id.cb2);
        CheckBox cb3=(CheckBox) findViewById(R.id.cb3);
        CheckBox cb4=(CheckBox) findViewById(R.id.cb4);
        TextView tv1=(TextView) findViewById(R.id.tv1);
        Button b1=(Button) findViewById(R.id.b1);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb1.isChecked()){
                    String checkres1= cb1.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected "+checkres1, Toast.LENGTH_SHORT).show();

                }
                else{
                   String checkres1=cb1.getText().toString();
                    Toast.makeText(MainActivity.this, "Unselected "+checkres1, Toast.LENGTH_SHORT).show();
                }

            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb2.isChecked()){
                    String checkres2= cb2.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected "+checkres2, Toast.LENGTH_SHORT).show();
                }
                else{
                    String checkres2= cb2.getText().toString();
                    Toast.makeText(MainActivity.this, "Unselected "+checkres2, Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb3.isChecked()){
                    String checkres3=cb3.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected "+checkres3, Toast.LENGTH_SHORT).show();
                }
                else {
                    String checkres3=cb3.getText().toString();
                    Toast.makeText(MainActivity.this, "Unselected "+checkres3, Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    String checkres4=cb4.getText().toString();
                    Toast.makeText(MainActivity.this, "Selected "+checkres4, Toast.LENGTH_SHORT).show();
                }
                else{
                    String checkres4=cb4.getText().toString();
                    Toast.makeText(MainActivity.this, "Unselected "+checkres4, Toast.LENGTH_SHORT).show();

                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                int total_items=0;
                if(cb1.isChecked()){
                    result.append("You ordered Fruits");
                    total_items+=60;
                }
                if(cb2.isChecked()){
                    result.append("You ordered Drinks");
                    total_items+=80;
                }
                if(cb3.isChecked()){
                    result.append("You ordered Snacks");
                    total_items+=100;
                }
                if (cb4.isChecked()){
                    result.append("You ordered Vegetables");
                    total_items+=50;
                }
                Toast.makeText(MainActivity.this, "The total bill is "+total_items, Toast.LENGTH_SHORT).show();

            }
        });




    }

}