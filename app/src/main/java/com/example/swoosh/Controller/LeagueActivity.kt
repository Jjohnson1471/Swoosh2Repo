package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.SELECTED_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coedButton.isChecked = false

        selectedLeague = "mens"

    }

    fun onWomensClicked(view:View) {
        mensLeagueButton.isChecked = false
        coedButton.isChecked = false

        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View) {
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        selectedLeague = "co-ed"

    }

    fun nextLeagueClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(SELECTED_LEAGUE , selectedLeague)

            println("Here is th const: $SELECTED_LEAGUE, here is the value of that const: $selectedLeague")

            startActivity(skillIntent) } else {
            Toast.makeText(this, "Please make a selection before continuing", Toast.LENGTH_SHORT).show()
        }
    }


}

