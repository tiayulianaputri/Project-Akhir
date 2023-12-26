package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView



class MateriActivity : AppCompatActivity() {

    private lateinit var profile: Button
    private lateinit var imageView: ImageView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)
        profile = findViewById(R.id.btnprofile)
        imageView = findViewById(R.id.gambar1)
        imageView1 = findViewById(R.id.gambar2)
        imageView2 = findViewById(R.id.gambar3)

    }

//    private fun btnprofile(){
//        profile.setOnClickListener {
//            startActivity(Intent(this, editprofile::class.java)) }
//         }
//    private fun btngambar1(){
//        imageView.setOnClickListener {
//            startActivity(Intent(this, materidua::class.java)) }
//    }
//    private fun btngambar2(){
//        imageView1.setOnClickListener {
//            startActivity(Intent(this, materitiga::class.java)) }
//    }
//    private fun btngambar3(){
//        imageView2.setOnClickListener {
//            startActivity(Intent(this, materiempat::class.java)) }
//    }
}

