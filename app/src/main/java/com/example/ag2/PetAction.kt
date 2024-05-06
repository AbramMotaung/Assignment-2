package com.example.ag2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PetAction : AppCompatActivity() {
    private lateinit var dogImage: ImageView

    private var happiness = 100
    private var hunger = 100
    private var cleanliness = 100


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        dogImage = findViewById(R.id.dog_image)

        // Set up click listeners
        findViewById<Button>(R.id.feed_button).setOnClickListener { feedDog() }
        findViewById<Button>(R.id.clean_button).setOnClickListener { cleanDog() }
        findViewById<Button>(R.id.play_button).setOnClickListener { playWithDog() }
    }

    // Feed the dog
    private fun feedDog() {
        // Update dog's status
        happiness += 20
        if (happiness > 100) happiness = 100
        dogImage.setImageResource(R.drawable.feed_dog)
    }

    // Clean the dog
    private fun cleanDog() {
        // Update dog's status
        cleanliness += 20
        if (cleanliness > 100) cleanliness = 100
        dogImage.setImageResource(R.drawable.cleaning_dog)
    }

    // Play with the dog
    private fun playWithDog() {
        // Update dog's status
        happiness += 20
        if (happiness > 100) happiness = 100
        dogImage.setImageResource(R.drawable.playing_dog)
    }
}

