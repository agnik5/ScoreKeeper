package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreFlames = 0;
    int scoreSirin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForFlames(0);
        displayForSirin(0);
    }

//Methods adding points for Flames of Bellydance

    public void addFiveForFlames(View view) {
        scoreFlames = scoreFlames + 5;
        displayForFlames(scoreFlames);
    }

    public void addFourForFlames(View view) {
        scoreFlames = scoreFlames + 4;
        displayForFlames(scoreFlames);
    }

    public void addThreeForFlames(View view) {
        scoreFlames = scoreFlames + 3;
        displayForFlames(scoreFlames);
    }

    public void addTwoForFlames(View view) {
        scoreFlames = scoreFlames + 2;
        displayForFlames(scoreFlames);
    }

    public void addOneForFlames(View view) {
        scoreFlames = scoreFlames + 1;
        displayForFlames(scoreFlames);
    }

//    Methods adding points for Sirin Tribe

    public void addFiveForSirin(View view) {
        scoreSirin = scoreSirin + 5;
        displayForSirin(scoreSirin);
    }
    public void addFourForSirin(View view) {
        scoreSirin = scoreSirin + 4;
        displayForSirin(scoreSirin);
    }
    public void addThreeForSirin(View view) {
        scoreSirin = scoreSirin + 3;
        displayForSirin(scoreSirin);
    }

    public void addTwoForSirin(View view) {
        scoreSirin = scoreSirin + 2;
        displayForSirin(scoreSirin);
    }

    public void addOneForSirin(View view) {
        scoreSirin = scoreSirin + 1;
        displayForSirin(scoreSirin);
    }

//    This method resets the score for both teams

    public void resetScore(View view) {
        scoreFlames = 0;
        scoreSirin = 0;
        displayForFlames(scoreFlames);
        displayForSirin(scoreSirin);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForFlames(int score) {
        TextView scoreView = (TextView) findViewById(R.id.flames_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForSirin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sirin_score);
        scoreView.setText(String.valueOf(score));
    }
}