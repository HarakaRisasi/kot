package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return(1..numSides).random()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      A click listener is some code for what to do when a tap or click happens.
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
//          Within the curly braces, you put instructions for what should happen when the button is tapped.
            rollButton.setOnClickListener {
                rollDice()
            }
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)

        resultTextView.text = diceRoll.toString()
    }
}





