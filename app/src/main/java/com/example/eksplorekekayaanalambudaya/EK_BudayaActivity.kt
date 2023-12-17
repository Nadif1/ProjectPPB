package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EK_BudayaActivity : AppCompatActivity() {

    private lateinit var back3: ImageView
    private lateinit var btnbans: ImageView
    private lateinit var btnfb: ImageView
    private lateinit var btnab: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ek_budaya)
        supportActionBar?.hide()

        back3 = findViewById(R.id.back3)
        btnbans = findViewById(R.id.btnbans)
        btnfb = findViewById(R.id.btnfb)
        btnab = findViewById(R.id.btnab)

        back3tokategori()
        btnbanstobakaua()
        btnfbtofestivalbudaya()
        btnabtoalekbatagakgala()
    }
    private fun back3tokategori() {
        back3.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnbanstobakaua() {
        btnbans.setOnClickListener{
            startActivity(Intent(this, BakauaAdatActivity::class.java))
        }
    }
    private fun btnfbtofestivalbudaya() {
        btnfb.setOnClickListener{
            startActivity(Intent(this, FestivalBudayaActivity::class.java))
        }
    }
    private fun btnabtoalekbatagakgala() {
        btnab.setOnClickListener{
            startActivity(Intent(this, AlekBatagakGalaActivity::class.java))
        }
    }
}