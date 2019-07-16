package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.helloworld.R.id.roll_button
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //Coding challenge
        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = Random().nextInt(6)+1
        resultText.text = randomInt.toString()
    }
       //Coding Challenge
    private fun countUp() {
        val resultText :  TextView = findViewById(R.id.result_text)
           if (resultText.text == "Hello World!") {
               resultText.text = "1"
           } else {

               var resultInt = resultText.text.toString().toInt()

               if (resultInt < 6) {
                   resultInt++
                   resultText.text = resultInt.toString()
               }
           }
           }

    }

