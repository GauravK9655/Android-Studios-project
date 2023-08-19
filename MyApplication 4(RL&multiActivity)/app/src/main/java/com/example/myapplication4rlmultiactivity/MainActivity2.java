package com.example.myapplication4rlmultiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b2=(Button) findViewById(R.id.b2);
        TextView tv1=(TextView) findViewById(R.id.tv1);
        TextView tv2=(TextView) findViewById(R.id.tv2);

        Intent i2=getIntent();
        String s =i2.getStringExtra("Num");
        int n=Integer.parseInt(s);
        double sum=0;
        StringBuilder op= new StringBuilder();

        for(double j=1;j<=n;j++){
            sum+=1/j;                                 //Sum of series logic//
        }
        for(int i=1;i<=n;i++){
            if(i==1) {                               //Series Visualisation Logic//
                op.append("1");
            }
            else if(i<=n){
                op.append("+1/"+i);
            }
        }
        tv1.setText("SUM= "+sum);
        tv2.setText(op.toString());

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                Intent i2= new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i2);
                Toast.makeText(MainActivity2.this, "Previous Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}