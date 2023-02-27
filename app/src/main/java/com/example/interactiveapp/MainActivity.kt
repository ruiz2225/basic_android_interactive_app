package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val luckyButton = findViewById<Button>(R.id.btn_lucky)
        val luckyNumberText = findViewById<TextView>(R.id.txt_lucky_number)

        luckyButton.setOnClickListener { getLucky(luckyNumberText) }
    }

    private fun getLucky(luckyNumber: TextView){
        val randomNumber = (1..100).random()
        luckyNumber.text = randomNumber.toString()
        //Toast.makeText(this, R.string.strg_msg_button_clicked, Toast.LENGTH_LONG).show()
    }
}