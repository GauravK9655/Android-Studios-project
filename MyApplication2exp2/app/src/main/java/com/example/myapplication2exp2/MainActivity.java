package com.example.myapplication2exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext1 =(EditText) findViewById(R.id.et1);
        TextView title =(TextView) findViewById(R.id.tv);
        ImageButton button1= (ImageButton) findViewById(R.id.button1);
        ImageButton button2= (ImageButton) findViewById(R.id.button2);
        TextView resulttext=(TextView) findViewById(R.id.resulttv);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= edittext1.getText().toString();
                int n= Integer.parseInt(s);
                if(n%2==0){
                    resulttext.setText("Entered number is EVEN");
                }
                else{
                    resulttext.setText("Entered number is ODD");
                }
                Toast.makeText(MainActivity.this, "Odd or Even Performed!", Toast.LENGTH_SHORT).show();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= edittext1.getText().toString();
                int n= Integer.parseInt(s);
                int sum=1;
                for(int i=1;i<=n;i++){
                    sum *= i;
                }
                resulttext.setText("The Factorial is "+sum);
                Toast.makeText(MainActivity.this, "Factorial Performed", Toast.LENGTH_SHORT).show();

            }
        });

    }


}
