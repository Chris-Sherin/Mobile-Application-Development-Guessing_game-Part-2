package com.example.guessing_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var secretNumber= 100
    var attempt=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberGuessedByUser=findViewById<TextInputLayout>(R.id.Number_input)
        val guessButtonClicked = findViewById<TextView>(R.id.Guess_button)
        val clueOrAnswer=findViewById<TextView>(R.id.Guess_Text)

        guessButtonClicked.setOnClickListener{
            attempt++

            var numberUser=(numberGuessedByUser.editText?.text.toString()).toInt()

            val newScreenIntent = Intent(this,EndGameActivity::class.java)

            newScreenIntent.putExtra("attemptval",attempt)
            newScreenIntent.putExtra("secretnum",secretNumber)
            if(secretNumber> numberUser)
                clueOrAnswer.text= "No :) My number is bigger"
            else if((attempt > 12) or (secretNumber == numberUser)) {
               startActivity(newScreenIntent)
            }
            else
                clueOrAnswer.text="No :) My number is smaller"





        }
        }

    }
