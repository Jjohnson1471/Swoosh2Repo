package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.SELECTED_LEAGUE
import com.example.swoosh.Utilities.SELECTED_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league: String? = ""
    var skillLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(SELECTED_LEAGUE)
    }

    fun onBeginnerClicked(view:View) {

        ballerButton.isChecked = false

        skillLevel = "beginner"
    }

    fun onBallerClicked(view: View) {

        beginnerButton.isChecked = false

        skillLevel = "baller"
    }

    fun onFinishClicked(view: View) {

        if(skillLevel != "") {
            val finalIntent = Intent(this, FinalActivity::class.java)
            startActivity(finalIntent)
            finalIntent.putExtra(SELECTED_SKILL, skillLevel)
            finalIntent.putExtra(SELECTED_LEAGUE, league)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}
