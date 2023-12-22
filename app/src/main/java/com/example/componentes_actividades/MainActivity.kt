package com.example.componentes_actividades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ventanaBienvenido()
        ventanaFecha()
        ventanaImagen()
    }

    private fun ventanaBienvenido(){
        val botonBienvenido = findViewById<Button>(R.id.btnBienvenido)
        botonBienvenido.setOnClickListener {
            val saltarVentanaBienvenido = Intent(this, Window2::class.java)
            startActivity(saltarVentanaBienvenido)
        }
    }

    private fun ventanaFecha(){
        val botonFecha = findViewById<Button>(R.id.btnFecha)
        botonFecha.setOnClickListener {
            val saltarVentanaFecha = Intent(this, Window3::class.java)
            startActivity(saltarVentanaFecha)
        }
    }

    private fun ventanaImagen(){
        val botonImagen = findViewById<Button>(R.id.btnImagen)
        botonImagen.setOnClickListener {
            val saltarVentanaImagen = Intent(this, Window4::class.java)
            startActivity(saltarVentanaImagen)
        }
    }
}