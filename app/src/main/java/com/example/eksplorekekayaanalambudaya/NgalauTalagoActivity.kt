package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class NgalauTalagoActivity : AppCompatActivity() {

    private lateinit var back6: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ngalau_talago)
        supportActionBar?.hide()

        back6 = findViewById(R.id.back6)
        back6toEKAlam()

        val linknt : TextView = findViewById(R.id.linknt)
        linknt.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back6toEKAlam() {
        back6.setOnClickListener{
            startActivity(Intent(this, EK_AlamActivity::class.java))
        }
    }
}