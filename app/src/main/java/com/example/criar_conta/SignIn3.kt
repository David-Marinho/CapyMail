package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn1Binding
import com.example.criar_conta.databinding.ActivitySignIn3Binding

class SignIn3 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener{
            nextScreen()
        }
    }

    private fun nextScreen(){
        val screen = Intent(this, SignIn4::class.java)
        startActivity(screen)
    }
}