package com.example.myapplication5implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.b1);
        Button b2=(Button) findViewById(R.id.b2);
        Button b3= (Button) findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(i1);
                Toast.makeText(MainActivity.this, "Youtube Opening!!!", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(Intent.ACTION_VIEW,Uri.parse("geo:19.109498886854883, 73.01270128706558"));
                startActivity(i2);
                Toast.makeText(MainActivity.this, "Location Revealing!!!", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3= new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918928660954"));
                startActivity(i3);
                Toast.makeText(MainActivity.this, "Calling!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}