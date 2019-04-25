package com.example.hellogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener {
            val game_description = Intent(this, GameDescription::class.java)
            startActivity(game_description)
        }
        imageView2.setOnClickListener {
            val game_description = Intent(this, GameDescription::class.java)
            startActivity(game_description)
        }
        imageView3.setOnClickListener {
            val game_description = Intent(this, GameDescription::class.java)
            startActivity(game_description)
        }
        imageView4.setOnClickListener {
            val game_description = Intent(this, GameDescription::class.java)
            startActivity(game_description)
        }
    }
}

class GameDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_description)
    }
}
