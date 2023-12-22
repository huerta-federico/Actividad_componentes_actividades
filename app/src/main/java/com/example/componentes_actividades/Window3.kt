package com.example.componentes_actividades

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class Window3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window3)
        ventanaRegresar3()
        mostrarFecha()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun mostrarFecha(){
        val fecha = findViewById<TextView>(R.id.textView4)
        val mostrarFecha = findViewById<Button>(R.id.btnMostrarFecha)

        mostrarFecha.setOnClickListener(){
            val current = Calendar.getInstance().time
            val formatter = SimpleDateFormat.getDateTimeInstance()
            val formattedDate = formatter.format(current)
            fecha.text = formattedDate
        }
    }

    private fun ventanaRegresar3(){
        val botonRegresar3 = findViewById<Button>(R.id.btnRegresar3)
        botonRegresar3.setOnClickListener(){
            val saltarVentanaRegresar3 = Intent(this, MainActivity::class.java)
            startActivity(saltarVentanaRegresar3)
        }
    }
}