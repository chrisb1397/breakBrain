package com.example.brain.break1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ModeGameActivity : AppCompatActivity() {

    private lateinit var tv_welcome : TextView
    private lateinit var button_fast : Button
    private lateinit var button_categories : Button
    private lateinit var playerName : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mode_game)

        tv_welcome = findViewById(R.id.tv_welcome)
        button_fast = findViewById(R.id.btn_fast_mode)
        button_categories = findViewById(R.id.btn_categories_mode)

        playerName = intent.getStringExtra(SetNameActivity.INTENT_PLAYER_GAME)?:"ERROR"

        tv_welcome.text = getString(R.string.lbl_welcome, playerName)



    }
}
