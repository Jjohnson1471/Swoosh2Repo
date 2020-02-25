package com.example.swoosh.Controller

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.SELECTED_LEAGUE
import com.example.swoosh.Utilities.SELECTED_SKILL
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : BaseActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league = intent.getStringExtra(SELECTED_LEAGUE)
        val skillLevel = intent.getStringExtra(SELECTED_SKILL)

        searchLeaguesText.text = "Looking for a $league $skillLevel near you..."

    }

}
