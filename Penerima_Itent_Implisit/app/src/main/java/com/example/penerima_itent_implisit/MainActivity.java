package com.example.penerima_itent_implisit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri url = intent.getData();

        if (url != null) {
            String url_string =	"URL: " + url.toString();
            TextView textView = (TextView) findViewById(R.id.text_url_message);
            textView.setText(url_string);
        }
    }
}
