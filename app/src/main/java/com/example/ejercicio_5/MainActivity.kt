package com.example.ejercicio_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonApretado = findViewById<Button>(R.id.button)

       botonApretado.setOnClickListener {
           Log.d("BottonID", "Botón Apretado")
       }
    }
}

