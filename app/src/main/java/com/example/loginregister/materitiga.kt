package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class materitiga : AppCompatActivity() {

    private lateinit var backbutton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materitiga)

        backbutton3 = findViewById(R.id.backbutton3)

        btnbutton3()

    }
    private fun btnbutton3(){
        backbutton3.setOnClickListener {
            startActivity(Intent(this, MateriActivity::class.java))
        }
    }
}