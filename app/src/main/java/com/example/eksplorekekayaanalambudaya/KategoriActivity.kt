package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class KategoriActivity : AppCompatActivity() {

    private lateinit var btnprofil: ImageView
    private lateinit var ktg1: ImageView
    private lateinit var ktg2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)
        supportActionBar?.hide()

        btnprofil = findViewById(R.id.btnprofil)
        ktg1 = findViewById(R.id.ktg1)
        ktg2 = findViewById(R.id.ktg2)

        btnprofiltoprofile()
        ktg1toalam()
        ktg2tobudaya()
    }
    private fun btnprofiltoprofile() {
        btnprofil.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
    private fun ktg1toalam() {
        ktg1.setOnClickListener{
            startActivity(Intent(this, EK_AlamActivity::class.java))
        }
    }
    private fun ktg2tobudaya() {
        ktg2.setOnClickListener{
            startActivity(Intent(this, EK_BudayaActivity::class.java))
        }
    }
}