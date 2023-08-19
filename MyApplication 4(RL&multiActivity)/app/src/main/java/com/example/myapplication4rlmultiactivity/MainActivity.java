package com.example.myapplication4rlmultiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.b1);
        EditText et1=(EditText) findViewById(R.id.et1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                String s =et1.getText().toString();
                i.putExtra("Num",s);
                startActivity(i);
                Toast.makeText(MainActivity.this,"Showing Results!!!", Toast.LENGTH_SHORT).show();


            }
        });
    }
}