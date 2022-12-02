package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivityMainBinding

class Main : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.criarConta.setOnClickListener{
            criarConta()
        }

        binding.login.setOnClickListener{
            telaLogin()
        }
    }

    private fun criarConta(){
        val next = Intent(this, SignIn1::class.java)
        startActivity(next)
    }

    private fun telaLogin(){
        val next = Intent(this, Login::class.java)
        startActivity(next)
    }
}