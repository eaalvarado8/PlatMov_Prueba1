package com.example.platmov_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        SaltarLogin()
        SaltarInicio()
    }
    fun SaltarInicio(){
        val btn_inicio = findViewById<Button>(R.id.btn_Inicio)
        btn_inicio.setOnClickListener(){
            val saltar : Intent = Intent(this, Inicio::class.java)
            startActivity(saltar)
        }
    }
    fun SaltarLogin(){
        val btn_registro = findViewById<Button>(R.id.btn_registro)
        btn_registro.setOnClickListener(){
            val saltar : Intent = Intent(this, Login::class.java)
            startActivity(saltar)
        }
    }
}