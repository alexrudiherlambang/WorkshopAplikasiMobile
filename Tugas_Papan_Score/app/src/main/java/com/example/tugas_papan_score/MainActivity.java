package com.example.tugas_papan_score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAscore = 0;
    private int teamBscore = 0;
    private TextView team_a_score;
    private TextView team_b_score;
    private  static String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilantimA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void tambahA(View v) {
        teamAscore=teamAscore+1;
        tampilantimA(teamAscore);
    }
    public void tampilantimB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void TambahB(View v) {
        teamBscore=teamBscore+1;
        tampilantimB(teamBscore);
    }
    public void resetPoint(View v){
        teamAscore = 0;
        teamBscore = 0;

        tampilantimA(teamAscore);
        tampilantimB(teamBscore);
    }
}
