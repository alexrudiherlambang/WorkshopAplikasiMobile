package com.example.alertsample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  onClickShowAlert(View view){
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);

        //	Set	the	dialog	title.
        myAlertBuilder.setTitle(R.string.alert_title);
        //	Set	the	dialog message.
        myAlertBuilder.setMessage(R.string.alert_message);

        //	Add	the	buttons.
        myAlertBuilder.setPositiveButton(R.string.oke,	new	DialogInterface.OnClickListener()	{
            @Override
            public	void	onClick(DialogInterface	dialog,	int	which)	{
                //	User	clicked	OK	button.
                Toast.makeText(getApplicationContext(),	getString(R.string.pressed_ok),
                        Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.setNegativeButton(R.string.cancell, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface	dialog,	int	which) {
                //	User	cancelled	the	dialog.
                Toast.makeText(getApplicationContext(),	getString(R.string.pressed_cancel),
                        Toast.LENGTH_SHORT).show();
            }
        });

        //	Create	and	show	the	AlertDialog.
        myAlertBuilder.show();
        }

    }
