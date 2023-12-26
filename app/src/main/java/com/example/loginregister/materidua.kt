package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class materidua : AppCompatActivity() {

    private lateinit var backbutton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materidua)

        backbutton2 = findViewById(R.id.backbutton2)

        btnbutton2()

    }
    private fun btnbutton2(){
        backbutton2.setOnClickListener {
            startActivity(Intent( this, MateriActivity::class.java ))
        }
    }

}