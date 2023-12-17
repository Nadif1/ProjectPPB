package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var button4: Button
    private lateinit var txt_signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        button4 = findViewById(R.id.button4)
        txt_signup = findViewById(R.id.txt_signup)

        button4tokategori()
        txt_signuptodaftar()
    }
    private fun button4tokategori() {
        button4.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun txt_signuptodaftar() {
        txt_signup.setOnClickListener{
            startActivity(Intent(this, DaftarActivity::class.java))
        }
    }
}