package com.bliss.csc.yeoulcom_list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;


import java.util.HashMap;

public class apply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
            }

            public  void onButton1Clicked(View view){
                Toast.makeText(getApplicationContext(), "신청되었습니다.", Toast.LENGTH_SHORT).show();
            }
        }
