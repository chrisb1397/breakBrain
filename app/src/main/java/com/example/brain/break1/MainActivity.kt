package com.example.brain.break1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    private lateinit var button_play : Button
    private lateinit var button_scores : Button
    private lateinit var button_settings : Button


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_play = findViewById(R.id.btn_play)
        button_scores = findViewById(R.id.btn_scores)
        button_settings = findViewById(R.id.btn_options)

        button_play.setOnClickListener{showNameActivity()}

    }

    private fun showNameActivity(){
        val gameActivityIntent = Intent (this, SetNameActivity::class.java)
        startActivity(gameActivityIntent)
    }
}
