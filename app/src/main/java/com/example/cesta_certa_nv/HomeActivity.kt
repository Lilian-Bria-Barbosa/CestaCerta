package com.example.cesta_certa_nv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnVoltar = findViewById<Button>(R.id.button5)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val btnCompartilhar = findViewById<ImageButton>(R.id.compartilhar)
        btnCompartilhar.setOnClickListener {
            val intent = Intent(this, CompartilharActivity::class.java)
            startActivity(intent)
        }

        val btnCriar = findViewById<Button>(R.id.buttonCriarLista)
        btnCriar.setOnClickListener {
            val intent = Intent(this, CriarListaActivity::class.java)
            startActivity(intent)
        }

        val btnSobre = findViewById<Button>(R.id.button7)

        btnSobre.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)

        val compartilhar = findViewById<ImageButton>(R.id.compartilhar)

            compartilhar.setOnClickListener {
                val intent = Intent(this, CompartilharActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
