package com.example.eksplorekekayaanalambudaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class EK_AlamActivity : AppCompatActivity() {

    private lateinit var back2: ImageView
    private lateinit var btnpp: ImageView
    private lateinit var btngs: ImageView
    private lateinit var btnts: ImageView
    private lateinit var btnnt: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ek_alam)
        supportActionBar?.hide()

        btnpp = findViewById(R.id.btnpp)
        back2 = findViewById(R.id.back2)
        btngs = findViewById(R.id.btngs)
        btnts = findViewById(R.id.btnts)
        btnnt = findViewById(R.id.btnnt)

        btnpptopasirputih()
        back2tokategori()
        btngstogeopark()
        btntstotelabungsakti()
        btnnttongalautalago()
    }
    private fun back2tokategori() {
        back2.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnpptopasirputih() {
        btnpp.setOnClickListener{
            startActivity(Intent(this, PasirPutihActivity::class.java))
        }
    }
    private fun btngstogeopark() {
        btngs.setOnClickListener{
            startActivity(Intent(this, GeoparkSilokekActivity::class.java))
        }
    }
    private fun btntstotelabungsakti() {
        btnts.setOnClickListener{
            startActivity(Intent(this, TelabungSaktiKBActivity::class.java))
        }
    }
    private fun btnnttongalautalago() {
        btnnt.setOnClickListener{
            startActivity(Intent(this, NgalauTalagoActivity::class.java))
        }
    }
}