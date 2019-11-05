package com.zcalbrecht.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val word1 = intent.getStringExtra(WORD_1)
        val word2 = intent.getStringExtra(WORD_2)
        val word3 = intent.getStringExtra(WORD_3)
        val word4 = intent.getStringExtra(WORD_4)
        val word5 = intent.getStringExtra(WORD_5)
        val word6 = intent.getStringExtra(WORD_6)
        val word7 = intent.getStringExtra(WORD_7)
        val word8 = intent.getStringExtra(WORD_8)

        // Capture the layout's TextView and set the string as its text
        val answer1 = findViewById<TextView>(R.id.answer1).apply {
            text = word1
        }

        val answer2 = findViewById<TextView>(R.id.answer2).apply {
            text = word2
        }

        val answer3 = findViewById<TextView>(R.id.answer3).apply {
            text = word3
        }

        val answer4 = findViewById<TextView>(R.id.answer4).apply {
            text = word4
        }

        val answer5 = findViewById<TextView>(R.id.answer5).apply {
            text = word5
        }

        val answer6 = findViewById<TextView>(R.id.answer5).apply {
            text = word6
        }

        val answer7 = findViewById<TextView>(R.id.answer6).apply {
            text = word7
        }
    }

}
