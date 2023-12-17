package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class BakauaAdatActivity : AppCompatActivity() {

    private lateinit var back7: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakaua_adat)
        supportActionBar?.hide()

        back7 = findViewById(R.id.back7)
        back7toEKABudaya()

        val linkba : TextView = findViewById(R.id.linkba)
        linkba.movementMethod = LinkMovementMethod.getInstance()

        val linkbas : TextView = findViewById(R.id.linkbas)
        linkbas.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back7toEKABudaya() {
        back7.setOnClickListener{
            startActivity(Intent(this, EK_BudayaActivity::class.java))
        }
    }
}