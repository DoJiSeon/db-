package com.bliss.csc.yeoulcom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);
        Button contentsbtn3 = (Button) findViewById(R.id.contentsbtn3);
        contentsbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),moreinformation.class);
                startActivity(intent);
            }
        });


        Button contentsbtn1 = (Button) findViewById(R.id.contentsbtn1);
        contentsbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),List.class);
                startActivity(intent);
            }
        });

        Button contentsbtn2 = (Button) findViewById(R.id.contentsbtn2);
        contentsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),apply.class);
                startActivity(intent);
            }
        });

        }
    }
