package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA=0;
    int pointsB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(pointsA));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(pointsB));
    }

    public void resetScore(View view) {
        pointsA=0;
        pointsB=0;
        displayForTeamA();
        displayForTeamB();
    }

    public void show3A(View view){
        pointsA+=3;
        displayForTeamA();
    }
    public void show2A(View view){
        pointsA+=2;
        displayForTeamA();
    }
    public void show1A(View view){
        pointsA+=1;
        displayForTeamA();
    }

    public void show3B(View view){
        pointsB+=3;
        displayForTeamB();
    }
    public void show2B(View view){
        pointsB+=2;
        displayForTeamB();
    }
    public void show1B(View view){
        pointsB+=1;
        displayForTeamB();
    }
}
