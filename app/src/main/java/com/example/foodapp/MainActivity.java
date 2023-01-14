package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.function.LongToIntFunction;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



        login = findViewById(R.id.btnlogin);
        singup = findViewById(R.id.btnsignup);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(MainActivity.this , SignIn_Activity.class);
                 startActivity(intent);
            }
        });
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Signup has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , SignUp_Acitivity.class);
                startActivity(intent);
            }
        });






    }
}