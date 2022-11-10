package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySegundaBinding
import com.example.criar_conta.databinding.ActivitySignIn3Binding

class sign_in3 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn3Binding.inflate(layoutInflater)
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