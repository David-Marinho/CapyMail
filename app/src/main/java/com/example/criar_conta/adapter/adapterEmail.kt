package com.example.criar_conta.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.criar_conta.databinding.EmailItemBinding
import com.example.criar_conta.model.Email

class adapterEmail(private val context: Context, private val lista: MutableList<Email>): RecyclerView.Adapter<adapterEmail.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = EmailItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.perfil.setImageResource(lista[position].perfil)
        holder.titulo.text = lista[position].titulo
        holder.conteudo.text = lista[position].conteudo
        holder.estrela.setImageResource(lista[position].estrela)
        holder.estudo.setImageResource(lista[position].estudo)
        holder.trabalho.setImageResource(lista[position].trabalho)
        holder.redes.setImageResource(lista[position].redes)
        holder.noticias.setImageResource(lista[position].noticias)
        holder.span.setImageResource(lista[position].span)
    }

    override fun getItemCount(): Int = lista.size

    inner class EmailViewHolder(binding: EmailItemBinding) : RecyclerView.ViewHolder(binding.root){
        val perfil = binding.perfil
        val titulo = binding.titulo
        val conteudo = binding.conteudo
        val estrela = binding.estrela
        val estudo = binding.estudo
        val trabalho = binding.trabalho
        val redes = binding.redes
        val noticias = binding.noticias
        val span = binding.span
    }
}