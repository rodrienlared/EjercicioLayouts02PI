package com.example.ejerciciolayouts02pi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ej1(view: View) {
        val intent = Intent(this, Ejericicio1::class.java)
        startActivity(intent)
    }

    fun ej2(view: View) {
        val intent = Intent(this, Ejercicio2::class.java)
        startActivity(intent)
    }

    fun ej3(view: View) {
        val intent = Intent(this, Ejercicio3::class.java)
        startActivity(intent)
    }

    fun ej4(view: View) {
        val intent = Intent(this, Ejercicio4::class.java)
        startActivity(intent)
    }
}