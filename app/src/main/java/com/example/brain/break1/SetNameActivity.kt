package com.example.brain.break1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SetNameActivity : AppCompatActivity() {

    private lateinit var player_name : TextView
    private lateinit var button_start : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_name)

        player_name = findViewById(R.id.et_name)
        button_start = findViewById(R.id.btn_start)

        button_start.setOnClickListener{showModeGame()}


    }

    private fun showModeGame(){
        val modeGameActivity = Intent(this, ModeGameActivity::class.java)
        modeGameActivity.putExtra(INTENT_PLAYER_GAME, player_name.text.toString())
        startActivity(modeGameActivity)

    }

    companion object{
        const val INTENT_PLAYER_GAME = "playerName"
    }
}
