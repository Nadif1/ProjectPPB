package com.example.eksplorekekayaanalambudaya

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class GeoparkSilokekActivity : AppCompatActivity() {

    private lateinit var back4: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geopark_silokek)
        supportActionBar?.hide()

        back4 = findViewById(R.id.back4)
        back4toEKAlam()

        val linkgs : TextView = findViewById(R.id.linkgs)
        linkgs.movementMethod = LinkMovementMethod.getInstance()

    }
    private fun back4toEKAlam() {
        back4.setOnClickListener{
            startActivity(Intent(this, EK_AlamActivity::class.java))
        }
    }
}