package com.example.android14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.first_frame, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_frame, new SecondFragment()).commit();
    }
}