package com.example.componentes_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.componentes_actividades.R

class window2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window2)
        ventanaRegresar()
    }



    fun ventanaRegresar(){
        val botonRegresar = findViewById<Button>(R.id.btnRegresar)
        botonRegresar.setOnClickListener(){
            val saltarVentanaRegresar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltarVentanaRegresar)
        }
    }
}