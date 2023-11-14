package com.example.platmov_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        SaltarInicio()
        SaltarRegistro()

    }

    fun SaltarInicio(){
        val btn_inicio = findViewById<Button>(R.id.btn_Inicio)
        btn_inicio.setOnClickListener(){
            val saltar : Intent = Intent(this, Inicio::class.java)
            startActivity(saltar)
        }
    }
    fun SaltarRegistro(){
        val btn_registro = findViewById<Button>(R.id.btn_registro)
        btn_registro.setOnClickListener(){
            val saltar : Intent = Intent(this, Registro::class.java)
            startActivity(saltar)
        }
    }
}