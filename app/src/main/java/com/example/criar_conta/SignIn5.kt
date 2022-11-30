package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn5Binding

class SignIn5 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener{
            backScreen()
        }
    }

    private fun backScreen(){
        val inicio = Intent(this, Main::class.java)
        startActivity(inicio)
    }
}