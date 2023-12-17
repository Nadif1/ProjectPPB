package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class PasirPutihActivity : AppCompatActivity() {

    private lateinit var back3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasir_putih)
        supportActionBar?.hide()

        back3 = findViewById(R.id.back3)
        back3toEKAlam()

        val link1 : TextView = findViewById(R.id.link1)
        link1.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back3toEKAlam() {
        back3.setOnClickListener{
            startActivity(Intent(this, EK_AlamActivity::class.java))
        }
    }
}