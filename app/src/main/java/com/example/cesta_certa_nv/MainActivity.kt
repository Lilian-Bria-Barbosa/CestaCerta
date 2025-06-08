package com.example.cesta_certa_nv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEntrar = findViewById<Button>(R.id.button)

        btnEntrar.setOnClickListener {
            // Navegar para a tela Home
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}