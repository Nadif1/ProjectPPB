package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class AlekBatagakGalaActivity : AppCompatActivity() {

    private lateinit var back9: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alek_batagak_gala)
        supportActionBar?.hide()

        back9 = findViewById(R.id.back9)
        back9toEKBUdaya()

        val linkalek : TextView = findViewById(R.id.linkalek)
        linkalek.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back9toEKBUdaya() {
        back9.setOnClickListener{
            startActivity(Intent(this, EK_BudayaActivity::class.java))
        }
    }
}