package com.example.loginregister

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class RegisterActivity : AppCompatActivity() {
    private lateinit var buttoncreatnow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        buttoncreatnow=findViewById(R.id.button3)


        buttoncreatnow.setOnClickListener { val intentDirection = Intent(this@RegisterActivity, LoginActivity::class.java)
        startActivity(intentDirection)}

    }


    }