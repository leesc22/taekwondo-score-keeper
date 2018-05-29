package com.github.leesc22.taekwondoscorekeeper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    // Tracks the score for Team A
    private var scoreTeamA:Int = 0

    // Tracks the score for Team B
    private var scoreTeamB:Int = 0

    // Tracks the gam-jeom for Team A
    private var gamjeomTeamA = 0

    // Tracks the gam-jeom for Team B
    private var gamjeomTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    fun addFourForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 4
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 5 points.
     */
    fun addFiveForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 5
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the gam-jeom for Team A.
     */
    fun addGamJeomForTeamA(v: View) {
        gamjeomTeamA = gamjeomTeamA + 1
        scoreTeamB = scoreTeamB + 1
        displayGamJeomForTeamA(gamjeomTeamA)
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 4 points.
     */
    fun addFourForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 4
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 5 points.
     */
    fun addFiveForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 5
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the gam-jeom for Team A.
     */
    fun addGamJeomForTeamB(v: View) {
        gamjeomTeamB = gamjeomTeamB + 1
        scoreTeamA = scoreTeamA + 1
        displayGamJeomForTeamB(gamjeomTeamB)
        displayForTeamA(scoreTeamA)
    }

    /*
     * Reset score
     */
    fun resetScore(v: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        gamjeomTeamA = 0
        gamjeomTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
        displayGamJeomForTeamA(gamjeomTeamA)
        displayGamJeomForTeamB(gamjeomTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the gam-jeom for Team A.
     */
    fun displayGamJeomForTeamA(gamjeom: Int) {
        val gamjeomView = findViewById(R.id.team_a_gamjeom) as TextView
        gamjeomView.text = gamjeom.toString()
    }

    /**
     * Displays the gam-jeom for Team B.
     */
    fun displayGamJeomForTeamB(gamjeom: Int) {
        val gamjeomView = findViewById(R.id.team_b_gamjeom) as TextView
        gamjeomView.text = gamjeom.toString()
    }
}