package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView



class editprofile : AppCompatActivity() {
    private lateinit var backbutton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)
        backbutton = findViewById(R.id.backbutton)


        backbutton()

    }

    private fun backbutton(){
        backbutton.setOnClickListener {
            startActivity(Intent(this,editprofile::class.java))
        }

    }    }