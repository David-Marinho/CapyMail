package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn1Binding

class sign_in_1 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            nextScreen()
        }
    }

    private fun nextScreen(){
        val screen = Intent(this, criarConta::class.java)
        startActivity(screen)
    }
}