package com.example.rawcipher

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EncryptionClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enc)

        val textEdit = findViewById<EditText>(R.id.editTextTextPersonName)
        val keyEdit = findViewById<EditText>(R.id.editTextNumber)
        val view = findViewById<TextView>(R.id.textView)

        val encryptionButton = findViewById<Button>(R.id.e_button)
        encryptionButton.setOnClickListener {
            val message = textEdit.text.toString()
            var key = keyEdit.text.toString().toInt()
            if (key >= 26){ key %= 26 }
            val sol = caesarEncrypt(message, key)
            view.text = sol
        }
    }

        private fun caesarEncrypt(message: String, key: Int): String {
            val convMessage = message.lowercase()
            val letters = "abcdefghijklmnopqrstuvwxyz"
            val translated = mutableListOf<String>()
            val len = convMessage.length - 1
            for (i in 0..len) {
                if (convMessage[i] in letters) {
                    translated.add(i, letters[(letters.indexOf(convMessage[i]) + key) % 26].toString())
                } else {
                    translated.add(i, convMessage[i].toString())
                }
            }
            return translated.joinToString("")
        }
    }


