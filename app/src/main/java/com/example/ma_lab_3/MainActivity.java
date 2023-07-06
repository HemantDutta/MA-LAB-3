package com.example.ma_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        Intent intent = new Intent(this, HomeActivity.class);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        if(username.getText().toString() == "Hemant" && password.getText().toString() == "admin"){
            String message = "Welcome "+username.getText().toString();
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

            intent.putExtra("username", username.getText().toString());
            intent.putExtra("password", password.getText().toString());

            startActivity(intent);
        }
    }
}