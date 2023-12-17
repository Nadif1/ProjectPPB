package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class FestivalBudayaActivity : AppCompatActivity() {

    private lateinit var back8: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival_budaya)
        supportActionBar?.hide()

        back8 = findViewById(R.id.back8)
        back8toEKBUdaya()

        val linkfb : TextView = findViewById(R.id.linkfb)
        linkfb.movementMethod = LinkMovementMethod.getInstance()

        val linkfesbud : TextView = findViewById(R.id.linkfesbud)
        linkfesbud.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back8toEKBUdaya() {
        back8.setOnClickListener{
            startActivity(Intent(this, EK_BudayaActivity::class.java))
        }
    }
}