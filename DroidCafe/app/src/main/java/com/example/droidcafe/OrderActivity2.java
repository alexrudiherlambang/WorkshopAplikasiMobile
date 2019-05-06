package com.example.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order3);

        Intent intent = getIntent();
        String message = intent.getStringExtra(com.example.droidcafe.MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_messege);
        textView.setText(message);
    }
}