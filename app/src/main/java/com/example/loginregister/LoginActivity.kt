package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class LoginActivity : AppCompatActivity() {
    private lateinit var buttonlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonlogin = findViewById(R.id.btn_login)

        buttonlogin.setOnClickListener {
            var intentDirection = Intent(this@LoginActivity, MainActivity2::class.java)
            startActivity(intentDirection) }
    }
}