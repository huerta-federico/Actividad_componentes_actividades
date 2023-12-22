package com.example.componentes_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class window4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window4)
        ventanaRegresar4()
    }



    fun ventanaRegresar4(){
        val botonRegresar4 = findViewById<Button>(R.id.btnRegresar4)
        botonRegresar4.setOnClickListener(){
            val saltarVentanaRegresar4: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltarVentanaRegresar4)
        }
    }
}