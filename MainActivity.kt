package com.example.rawcipher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val encrypt = findViewById<Button>(R.id.encrypt_button)
    encrypt.setOnClickListener {
            //val encIntent = Intent(this@MainActivity,EncryptionClass::class.java)
            startActivity(Intent(this@MainActivity, EncryptionClass::class.java))
    }


    val decrypt = findViewById<Button>(R.id.decrypt_button)
        decrypt.setOnClickListener {
            startActivity(Intent(this@MainActivity,DecryptionClass::class.java))
        }

    }
}