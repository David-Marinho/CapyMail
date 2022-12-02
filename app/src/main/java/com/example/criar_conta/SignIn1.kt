package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn1Binding

class SignIn1 : AppCompatActivity() {
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
        val screen = Intent(this, SignIn2::class.java)
        startActivity(screen)
    }
}