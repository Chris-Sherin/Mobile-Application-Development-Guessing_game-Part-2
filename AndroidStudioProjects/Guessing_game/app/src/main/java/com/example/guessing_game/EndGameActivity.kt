package com.example.guessing_game

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EndGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)

        val attemptNum=intent.getIntExtra("attemptval",0)
        val secretNum=intent.getIntExtra("secretnum",0)
        val attempt_desc=findViewById<TextView>(R.id.Attempt_description)
        val resultNum=findViewById<TextView>(R.id.Result_text)

        if(attemptNum > 12 )
        {
            attempt_desc.text="You lost after 12 attempts. The number is "
            resultNum.text="$secretNum"
            resultNum.setTextColor(Color.parseColor("#FF0000"))



        }
        else
        {
            attempt_desc.text="You won! The number is "
            resultNum.text="$secretNum"
            resultNum.setTextColor(Color.parseColor("#00FF00"))
        }

    }
}