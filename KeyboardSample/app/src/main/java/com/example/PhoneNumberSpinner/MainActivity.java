package com.example.PhoneNumberSpinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //	Create	the	spinner.
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        //	Create	ArrayAdapter	using	the	string	array	and	default	spinner	layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.label_array, android.R.layout.simple_spinner_item);

        //	Specify	the	layout	to	use	when	the	list	of	choices	appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        //	Apply	the	adapter	to	the	spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText_main);
        if (editText != null) {
            String showString = editText.getText().toString() + "-" + mSpinnerLabel;
            TextView phoneNumberResult = (TextView) findViewById(R.id.text_phonelabel);
            if (phoneNumberResult !=null)
                phoneNumberResult.setText(showString);
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
        mSpinnerLabel = parent.getItemAtPosition(i).toString();
        showText(view);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected");
    }
}

