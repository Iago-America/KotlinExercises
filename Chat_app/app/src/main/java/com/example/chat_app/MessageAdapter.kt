package com.example.chat_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items: List<String> = listOf("Um", "Dois", "Três")

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val card = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.message_card,parent,false)
        return MessageViewHolder(card)
    } /* Função responsavel por ler o arquivo de Layout (Cardview) que tem a forma da view
    que queremos exibir e criar um objeto ViewHolder. ViewHolder é o cara que segura a view
       que no nosso caso vai ser a TextView */

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = items[position]
        if (holder is MessageViewHolder) {
            holder.messageTextView.text = currentItem
        }
    }

    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val messageTextView: TextView = itemView.findViewById(R.id.message_textview)
    }
}