package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class TelabungSaktiKBActivity : AppCompatActivity() {

    private lateinit var back5: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telabung_sakti_kbactivity)
        supportActionBar?.hide()

        back5 = findViewById(R.id.back5)
        back5toEKAlam()

        val linkts : TextView = findViewById(R.id.linkts)
        linkts.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back5toEKAlam() {
        back5.setOnClickListener{
            startActivity(Intent(this, EK_AlamActivity::class.java))
        }
    }
}