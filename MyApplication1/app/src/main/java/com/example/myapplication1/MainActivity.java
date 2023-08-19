package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview1 = (TextView) findViewById(R.id.tv);
        TextView textview2 =(TextView) findViewById(R.id.tv2);
        EditText edittext1 =(EditText) findViewById(R.id.et1);
        EditText edittext2 = (EditText) findViewById(R.id.et2);
        ImageButton button1 =(ImageButton) findViewById(R.id.button1);
        TextView resulttext = (TextView) findViewById(R.id.res_tv);
        ImageButton button2 = (ImageButton) findViewById(R.id.button2);
        ImageButton button3 = (ImageButton) findViewById(R.id.button3);
        ImageButton button4= (ImageButton) findViewById(R.id.button4);
        ImageView imgv=(ImageView) findViewById(R.id.img1) ;




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= edittext1.getText().toString();
                int n1= Integer.parseInt(s1);
                String s2= edittext2.getText().toString();
                int n2= Integer.parseInt(s2);
                int addition= n1 + n2;
                resulttext.setText("The Addition result is "+addition);
                Toast.makeText(MainActivity.this, "Addition Performed!!!", Toast.LENGTH_SHORT).show();


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = edittext1.getText().toString();
                int n1= Integer.parseInt(s1);
                String s2= edittext2.getText().toString();
                int n2= Integer.parseInt(s2);
                int subtraction= n1-n2;
                resulttext.setText("The Subtraction result is "+subtraction);
                Toast.makeText(MainActivity.this, "Subtraction Performed!!!", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= edittext1.getText().toString();
                int n1= Integer.parseInt(s1);
                String s2 = edittext2.getText().toString();
                int n2 = Integer.parseInt(s2);
                int multiplication= n1*n2;
                resulttext.setText("The Multilplication result is "+multiplication);
                Toast.makeText(MainActivity.this, "Multiplication Performed!!!", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= edittext1.getText().toString();
                int n1= Integer.parseInt(s1);
                String s2 = edittext2.getText().toString();
                int n2 = Integer.parseInt(s2);
                double Division = n1/n2;
                resulttext.setText("The Division result is "+Division);
                Toast.makeText(MainActivity.this, "Division Performed!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}