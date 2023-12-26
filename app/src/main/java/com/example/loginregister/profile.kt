package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class profile : AppCompatActivity() {

    private lateinit var edtprofile: Button
    private lateinit var btnlgt: Button
    private lateinit var backbutton1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        edtprofile = findViewById(R.id.editprofile)
        btnlgt = findViewById(R.id.btnlgt)
        backbutton1 = findViewById(R.id.backbutton1)

        btneditprofile()
        btnlogout()
        btnprofile()

    }
    private fun btneditprofile(){
        edtprofile.setOnClickListener {
            startActivity(Intent(this, editprofile::class.java))
        }
    }
    private fun btnlogout(){
        btnlgt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun btnprofile(){
        backbutton1.setOnClickListener {
            startActivity(Intent(this,MateriActivity::class.java))
        }

    }
}





