package com.zcalbrecht.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }

    fun counter (view: View) {

        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()

        var count = 0

        try {
            count = Integer.parseInt(countString)
        }
        catch (e: NumberFormatException) {
            count = 0
        }

        count++

        showCountTextView.text = count.toString()
    }

    fun random (view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val randomInt = (0..10).random()
        showCountTextView.text = randomInt.toString()
    }
}
