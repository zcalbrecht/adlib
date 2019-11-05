package com.zcalbrecht.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val WORD_1 = "com.example.myfirstapp.MESSAGE1"
const val WORD_2 = "com.example.myfirstapp.MESSAGE2"
const val WORD_3 = "com.example.myfirstapp.MESSAGE3"
const val WORD_4 = "com.example.myfirstapp.MESSAGE4"
const val WORD_5 = "com.example.myfirstapp.MESSAGE5"
const val WORD_6 = "com.example.myfirstapp.MESSAGE6"
const val WORD_7 = "com.example.myfirstapp.MESSAGE7"
const val WORD_8 = "com.example.myfirstapp.MESSAGE8"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)
        val editText5 = findViewById<EditText>(R.id.editText5)
        val editText6 = findViewById<EditText>(R.id.editText6)
        val editText7 = findViewById<EditText>(R.id.editText7)
        val editText8 = findViewById<EditText>(R.id.editText8)

        val message1 = editText1.text.toString()
        val message2 = editText2.text.toString()
        val message3 = editText3.text.toString()
        val message4 = editText4.text.toString()
        val message5 = editText5.text.toString()
        val message6 = editText6.text.toString()
        val message7 = editText7.text.toString()
        val message8 = editText8.text.toString()
        if( message1 != "" && message2 != "" && message3 != "" && message4 != "" && message5 != "" && message6 != "" && message7 != "" && message8 != "" ){
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra(WORD_1, message1)
                putExtra(WORD_2, message2)
                putExtra(WORD_3, message3)
                putExtra(WORD_4, message4)
                putExtra(WORD_5, message5)
                putExtra(WORD_6, message6)
                putExtra(WORD_7, message7)
                putExtra(WORD_8, message8)
            }
            startActivity(intent)
        }
        else
        {
            val text = "You didn't complete all the fields!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}
