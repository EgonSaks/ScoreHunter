package com.scorehunters.android.scorehunter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Tracks the score for Team A
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();

    /* Hide both the navigation bar and the status bar.
     * SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
     * a general rule, you should design your app to hide the status bar whenever you
     * hide the navigation bar.
     */

        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);

    }

    /**
     * Functionality for Team A point buttons starts here!
     * Here we declare the method
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Here call the method
     * Displays the given score for Team A.
     * Increase the score for Team A by 3 points.
     */

    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Functionality for Team A 3 point button ends here!
     * Displays the given score for Team A.
     */

    /**
     * Increase the score for Team A by 2 points.
     */

    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     */

    public void addOneForTeamA(View view) {
        displayForTeamA(1);
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Functionality for Team B point buttons starts here!
     * Here we declare the method
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view) {
        displayForTeamB(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        displayForTeamB(1);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
