package com.example.swoosh.Controller

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>("EXTRA_PLAYER")

        searchLeaguesText.text = "Looking for a ${player?.skill} ${player?.league} league near you..."

    }


}
