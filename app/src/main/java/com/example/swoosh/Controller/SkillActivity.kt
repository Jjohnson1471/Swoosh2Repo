package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

     var player: Player? = Player("", "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player =intent.getParcelableExtra("EXTRA_PLAYER")

    }


        fun onBeginnerClicked(view: View) {

            ballerButton.isChecked = false

            player?.skill = "beginner"
        }

        fun onBallerClicked(view: View) {

            beginnerButton.isChecked = false

            player?.skill = "baller"
        }

        fun onFinishClicked(view: View) {

            if (player?.skill != "") {
                val finalIntent = Intent(this, FinalActivity::class.java)
                finalIntent.putExtra("EXTRA_PLAYER", player)
                startActivity(finalIntent)
            } else {
                Toast.makeText(this, "Please select a league level", Toast.LENGTH_SHORT).show()
            }

        }
    }
