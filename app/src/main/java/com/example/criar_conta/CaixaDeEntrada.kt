package com.example.criar_conta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.criar_conta.adapter.adapterEmail
import com.example.criar_conta.databinding.ActivityCaixaDeEntradaBinding
import com.example.criar_conta.model.Email

class CaixaDeEntrada : AppCompatActivity() {
    private lateinit var binding: ActivityCaixaDeEntradaBinding
    private lateinit var adapterEmail: adapterEmail
    private val listaEmails: MutableList<Email> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaixaDeEntradaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewEmail = binding.recyclerEmails
        recyclerViewEmail.layoutManager = LinearLayoutManager(this)
        recyclerViewEmail.setHasFixedSize(true)
        adapterEmail = adapterEmail(this, listaEmails)
        recyclerViewEmail.adapter = adapterEmail

        val email1 = Email(
            perfil = R.drawable.capivara1,
            titulo = "Email 1",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_on,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_on,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email1)

        val email2 = Email(
            perfil = R.drawable.capivara6,
            titulo = "Email 2",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_on,
            estudo = R.drawable.livro_on,
            trabalho = R.drawable.trabalho_on,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email2)

        val email3 = Email(
            perfil = R.drawable.capivara4,
            titulo = "Email 3",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_on,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email3)

        val email4 = Email(
            perfil = R.drawable.capivara7,
            titulo = "Email 4",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_on,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_on,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email4)

        val email5 = Email(
            perfil = R.drawable.capivara3,
            titulo = "Email 5",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_on
        )
        listaEmails.add(email5)

        val email6 = Email(
            perfil = R.drawable.capivara5,
            titulo = "Email 6",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_on,
            span = R.drawable.span_off
        )
        listaEmails.add(email6)

        val email7 = Email(
            perfil = R.drawable.capivara1,
            titulo = "Email 7",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email7)

        val email8 = Email(
            perfil = R.drawable.capivara1,
            titulo = "Email 8",
            conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut blandit sem ac maximus consectetur.",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email8)
    }
}