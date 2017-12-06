package com.gongloroth.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    private int cornerTeamA = 0;
    private int yellowCardTeamA = 0;
    private int redCardTeamA = 0;

    private int cornerTeamB = 0;
    private int yellowCardTeamB = 0;
    private int redCardTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerA(int score) {
        TextView cornerView = (TextView) findViewById(R.id.corner_text_a);
        cornerView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView yellowView = (TextView) findViewById(R.id.yellow_text_a);
        yellowView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView redView = (TextView) findViewById(R.id.red_text_a);
        redView.setText(String.valueOf(score));
    }

    public void scorePlusA(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void cornerPlusA(View view){
        cornerTeamA +=1;
        displayCornerA(cornerTeamA);
    }

    public void yellowPlusA(View view){
        yellowCardTeamA +=1;
        displayYellowA(yellowCardTeamA);
    }

    public void redPlusA(View view){
        redCardTeamA +=1;
        displayRedA(redCardTeamA);
    }


    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerB(int score) {
        TextView cornerView = (TextView) findViewById(R.id.corner_text_b);
        cornerView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView yellowView = (TextView) findViewById(R.id.yellow_text_b);
        yellowView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView redView = (TextView) findViewById(R.id.red_text_b);
        redView.setText(String.valueOf(score));
    }

    public void scorePlusB(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    public void cornerPlusB(View view){
        cornerTeamB +=1;
        displayCornerB(cornerTeamB);
    }

    public void yellowPlusB(View view){
        yellowCardTeamB +=1;
        displayYellowB(yellowCardTeamB);
    }

    public void redPlusB(View view){
        redCardTeamB +=1;
        displayRedB(redCardTeamB);
    }

    public void displayAll(){
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        displayCornerA(cornerTeamA);
        displayYellowA(yellowCardTeamA);
        displayRedA(redCardTeamA);

        displayCornerB(cornerTeamB);
        displayYellowB(yellowCardTeamB);
        displayRedB(redCardTeamB);

    }

    public void reset(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;

        cornerTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;

        cornerTeamB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;

        displayAll();
    }
}

