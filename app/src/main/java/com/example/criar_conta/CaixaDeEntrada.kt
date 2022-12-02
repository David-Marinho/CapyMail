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
            titulo = "Procuramos DJs",
            conteudo = "Bom dia. É com muito prazer que anunciamos que estamos procurando um DJ profisional. Se estiver interessado, favor, responder esse email com seu curriculo",
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
            titulo = "Olá mundo",
            conteudo = "Bom dia a todos! Esperamos que estejam gostando da apresentação.",
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
            titulo = "Envio de documento",
            conteudo = "Bom dia, Sr(a). Aqui esta os seus documentos que voce pediu a 3 meses atras. assinado: Coordenado sumida de CCO Piedade",
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
            titulo = "Que merda de aula",
            conteudo = "Um aluno acaba de enviar uma mensagem no grupo: 'Lab. de Redes': 'Professor merda do caramba'",
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
            titulo = "Clique aqui e concorra a um iphone 20",
            conteudo = "Imperdivel!!! concorra agora a um iphone 20 é so se cadastrar nesse site nada suspeito",
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
            titulo = "Ultimas noticias no mundo",
            conteudo = "Agora: alguem importante falou alguma coisa e agora ta todo mundo xingando ele na internet. para mais noticias, acesse: www.sitealeatorio.com.br",
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
            titulo = "Faltou criatividade",
            conteudo = "foi mal, essa é só p encher linguiça",
            estrela = R.drawable.estrela_off,
            estudo = R.drawable.livro_off,
            trabalho = R.drawable.trabalho_off,
            redes = R.drawable.redes_off,
            noticias = R.drawable.noticias_off,
            span = R.drawable.span_off
        )
        listaEmails.add(email7)
    }
}