package com.example.loginregistermodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        Intent loginTntent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(loginTntent);
    }

    public void Register(View view) {
        Intent registerTntent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(registerTntent);
    }
}