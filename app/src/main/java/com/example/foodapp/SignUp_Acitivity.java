package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUp_Acitivity extends AppCompatActivity {
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_acitivity);

        getSupportActionBar().setTitle("Sign Up");
        register = findViewById(R.id.btnregister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp_Acitivity.this, "registered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp_Acitivity .this ,Acitivity_mainpage.class);
                startActivity(intent);
            }
        });
    }
}