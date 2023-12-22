package com.example.componentes_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Window2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window2)
        ventanaRegresar2()
    }
    private fun ventanaRegresar2(){
        val botonRegresar2 = findViewById<Button>(R.id.btnRegresar2)
        botonRegresar2.setOnClickListener {
            val saltarVentanaRegresar2 = Intent(this, MainActivity::class.java)
            startActivity(saltarVentanaRegresar2)
        }
    }
}