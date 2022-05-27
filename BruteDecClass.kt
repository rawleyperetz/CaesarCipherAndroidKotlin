package com.example.rawcipher

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BruteDecClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brute_dec)

        val bText = findViewById<TextView>(R.id.textView_brute)
        bText.text =  intent.getStringExtra("vials")//objVal.mess.toString()


    }

}
