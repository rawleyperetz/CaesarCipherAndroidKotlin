package com.example.rawcipher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DecryptionClass : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dec)



        val brute: Button = findViewById(R.id.brute_button)

        brute.setOnClickListener {
            val cipher: EditText = findViewById(R.id.dec_editTextTextPersonName)
            val cipherVal = cipher.text.toString()
            val mess = bruteForce(cipherVal)

            val intent = Intent(this@DecryptionClass, BruteDecClass::class.java)
            intent.putExtra("vials", mess)
            startActivity(intent)

        }


    }


     private fun bruteForce(cipherText: String): String {
        val convMessage = cipherText.lowercase()
        val letters = "abcdefghijklmnopqrstuvwxyz"
        val translated = mutableListOf<String>()
        val len = convMessage.length - 1
        for (each in 0..26){
            translated.add(each.toString())
            for (i in 0..len) {
                if (convMessage[i] in letters) {
                    translated.add(letters[(letters.indexOf(convMessage[i]) + each) % 26].toString())
                } else {
                    translated.add(convMessage[i].toString())
                }
            }
            translated.add("\n")
        }
        return translated.joinToString("")
    }

}