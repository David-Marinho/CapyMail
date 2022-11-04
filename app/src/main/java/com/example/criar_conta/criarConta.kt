package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivityCriarContaBinding
import com.example.criar_conta.databinding.ActivityTelaInicialBinding

class criarConta : AppCompatActivity() {
    private lateinit var binding: ActivityCriarContaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarContaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botao.setOnClickListener{
            next()
        }
    }

    private fun next(){
        val proximaTela = Intent(this, segunda_activity::class.java)
        startActivity(proximaTela)
    }
}