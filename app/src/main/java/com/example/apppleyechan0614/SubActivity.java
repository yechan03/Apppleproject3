package com.example.apppleyechan0614;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent=getIntent();
        String  s=intent.getStringExtra("input");

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}
