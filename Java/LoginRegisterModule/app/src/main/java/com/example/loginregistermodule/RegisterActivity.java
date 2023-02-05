package com.example.loginregistermodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void UploadRegisterInfo(View view) {
        EditText userName = findViewById(R.id.RegisterUserName);
        EditText password = findViewById(R.id.RegisterPassword);
        EditText repeatPassword = findViewById(R.id.RegisterRepeatPassword);
        EditText email = findViewById(R.id.RegisterEmail);
        EditText phoneNumber = findViewById(R.id.RegisterPhoneNumber);
        String userNameString = userName.getText().toString();
        String passwordString = password.getText().toString();
        String repeatPasswordString = repeatPassword.getText().toString();
        String emailString = email.getText().toString();
        String phoneNumberString = phoneNumber.getText().toString();
        Log.d("Register Activity", "User: " + userNameString + " registered");
        Log.d("Register Activity", "Password: " + passwordString);
        Log.d("Register Activity", "RepeatPassword: " + repeatPasswordString);
        Log.d("Register Activity", "Email: " + emailString);
        Log.d("Register Activity", "PhoneNumber: " + phoneNumberString);
    }
}