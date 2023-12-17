package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {

    private lateinit var back1: ImageView
    private lateinit var btnlogout: ImageView
    private lateinit var btnupdate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        back1 = findViewById(R.id.back1)
        btnlogout = findViewById(R.id.btnlogout)
        btnupdate = findViewById(R.id.btnupdate)

        back1tokategori()
        btnlogouttomain()
        btnupdatetokategori()
    }
    private fun back1tokategori() {
        back1.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnlogouttomain() {
        btnlogout.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun btnupdatetokategori() {
        btnupdate.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
}