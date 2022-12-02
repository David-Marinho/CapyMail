package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.criar_conta.databinding.ActivityConectarEmailsBinding

class ConectarEmails : AppCompatActivity() {
    private lateinit var binding: ActivityConectarEmailsBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConectarEmailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btnGmail.setOnClickListener {
            Toast.makeText(this, "Gmail conectado com sucesso", Toast.LENGTH_SHORT).show()
        }

        binding.btnOutlook.setOnClickListener {
            Toast.makeText(this, "Outlook conectado com sucesso", Toast.LENGTH_SHORT).show()
        }

        binding.btnTdBird.setOnClickListener {
            Toast.makeText(this, "Thunder Bird conectado com sucesso", Toast.LENGTH_SHORT).show()
        }

        binding.btnNext.setOnClickListener {
            nextScreen()
        }
    }

    private fun nextScreen(){
        val screen = Intent(this, SignIn5::class.java)
        startActivity(screen)
    }
}