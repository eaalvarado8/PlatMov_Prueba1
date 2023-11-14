package com.example.platmov_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SaltarVentana()
    }

    fun SaltarVentana(){
        val btn_login = findViewById<ImageView>(R.id.logo_img)
        btn_login.setOnClickListener(){
            val saltar : Intent = Intent(this, Login::class.java)
            startActivity(saltar)
        }
    }
}