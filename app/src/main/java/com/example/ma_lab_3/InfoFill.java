package com.example.ma_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InfoFill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_fill);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView welcomeUser = findViewById(R.id.welcomeUser);
        welcomeUser.setText("Welcome "+username);
    }

}
