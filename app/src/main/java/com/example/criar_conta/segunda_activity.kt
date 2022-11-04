package com.example.criar_conta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criar_conta.databinding.ActivitySegundaBinding

class segunda_activity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener{
            backScreen()
        }
    }

    private fun backScreen(){
        var inicio = Intent(this, tela_inicial::class.java)
        startActivity(inicio)
    }
}