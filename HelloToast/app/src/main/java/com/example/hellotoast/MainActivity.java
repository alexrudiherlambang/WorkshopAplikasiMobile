package com.example.hellotoast;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private  static String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    @SuppressLint("SetText 18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            if (mCount % 10 == 0){
                Log.d(LOG_TAG, "Perhitungan adalah kelipatan: " + mCount );
            }
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_button_toast, Toast.LENGTH_LONG);
        toast.show();
    }
    public void resetCount(View view){
        mShowCount.setText(Integer.toString(0));
        mCount = 0;
    }
}
