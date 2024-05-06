package com.example.ag2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToSecondScreenButton: Button = findViewById(R.id.WelcomeButton)
        goToSecondScreenButton.setOnClickListener {
            val intent = Intent(this@MainActivity, PetAction::class.java)
            startActivity(intent)
        }
    }
}