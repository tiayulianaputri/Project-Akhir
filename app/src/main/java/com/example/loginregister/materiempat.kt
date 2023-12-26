package com.example.loginregister

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class materiempat : AppCompatActivity() {

    private lateinit var backbutton4 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materiempat)

        backbutton4 = findViewById(R.id.backbutton4)

        btnbutton4()
    }
    private fun btnbutton4(){
        backbutton4.setOnClickListener {
            startActivity(Intent(this, MateriActivity::class.java))
        }
    }
}