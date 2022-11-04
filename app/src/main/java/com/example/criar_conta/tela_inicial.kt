package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivityTelaInicialBinding

class tela_inicial : AppCompatActivity() {
    private lateinit var binding : ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.criarConta.setOnClickListener{
            criar_conta()
        }
    }

    private  fun criar_conta(){
        val proximaTela = Intent(this, sign_in_1::class.java)
        startActivity(proximaTela)
    }
}