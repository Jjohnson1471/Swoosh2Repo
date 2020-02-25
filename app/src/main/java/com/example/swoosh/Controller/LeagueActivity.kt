package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

        fun onMensClicked(view: View) {
            womensLeagueButton.isChecked = false
            coedButton.isChecked = false

            player.league = "mens"
        }

        fun onWomensClicked(view: View) {
            mensLeagueButton.isChecked = false
            coedButton.isChecked = false

            player.league = "womens"

        }

        fun onCoedClicked(view: View) {
            mensLeagueButton.isChecked = false
            womensLeagueButton.isChecked = false

            player.league = "co-ed"

        }

        fun nextLeagueClicked(view: View) {
            if (player.league != "") {
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra("EXTRA_PLAYER", player)
                startActivity(skillIntent)
            } else {
                Toast.makeText(this, "Please make a selection before continuing", Toast.LENGTH_LONG)
                    .show()
            }
        }


    }

