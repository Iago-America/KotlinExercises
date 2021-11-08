package com.example.lista_de_compras_app

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class ProdutoAdapter(contexto: Context) : ArrayAdapter<Produto>() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val v:View

        if (convertView != null) {
            v = convertView
        } else {
            //inflar o layout
        }

        return super.getView(position, convertView, parent)
    }
}