package com.example.cesta_certa_nv

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CompartilharActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compartilhar)

        val btnWhatsapp = findViewById<ImageButton>(R.id.btnWhatsapp)
        val btnEmail    = findViewById<ImageButton>(R.id.btnEmail)
        val btnVoltar   = findViewById<Button>(R.id.btnVoltar)

        // botão Voltar
        btnVoltar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // botão WhatsApp
        btnWhatsapp.setOnClickListener {
            val mensagem = "Confira minha lista no app Cesta Certa!"
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                setPackage("com.whatsapp")
                putExtra(Intent.EXTRA_TEXT, mensagem)
            }
            try {
                startActivity(intent)
            } catch (e: Exception) {
                // WhatsApp não instalado: redireciona para Play Store
                val fallback = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")
                )
                startActivity(fallback)
            }
        }

        //botão E-mail
        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_SUBJECT, "Minha Lista do App Cesta Certa")
                putExtra(Intent.EXTRA_TEXT, "Olá! Veja minha lista criada no app Cesta Certa.")
            }
            startActivity(Intent.createChooser(emailIntent, "Enviar e-mail usando:"))
        }
    }
}
