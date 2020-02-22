package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league: String? = ""
    var skillLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(SELECTED_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked() {

        ballerButton.isChecked = false

        skillLevel = "beginner"
    }

    fun onBallerClicked() {

        beginnerButton.isChecked = false

        skillLevel = "baller"
    }

    fun onFinishClicked() {

        if(skillLevel != "") {
            val finalIntent = Intent(this, FinalActivity::class.java)
            startActivity(finalIntent)
            finalIntent.putExtra(SELECTED_SKILL, skillLevel)
        } else {
            Toast.makeText(this, "Please select skill level", Toast.LENGTH_SHORT).show()
        }

    }
}
