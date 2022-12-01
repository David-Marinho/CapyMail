package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySignIn2Binding

class SignIn2 : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignIn2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var text = intent.extras("nome")

        binding.btnNext.setOnClickListener{
            nextScreen()
        }
    }

    private fun nextScreen(){
        val screen = Intent(this, SignIn3::class.java)
        startActivity(screen)
    }
}