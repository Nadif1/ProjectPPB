package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaftarActivity : AppCompatActivity() {

    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        supportActionBar?.hide()

        button3 = findViewById(R.id.button3)

        button3tokategori()
    }
    private fun button3tokategori() {
        button3.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}