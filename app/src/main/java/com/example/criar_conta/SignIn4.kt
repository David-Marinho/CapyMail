package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn4Binding

class SignIn4 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            nextScreen()
        }
    }

    private fun nextScreen(){
        val screen = Intent(this, ConectarEmails::class.java)
        startActivity(screen)
    }
}