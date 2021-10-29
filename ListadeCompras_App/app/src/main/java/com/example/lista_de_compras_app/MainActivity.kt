package com.example.lista_de_compras_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Implementação do adaptador
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        //definindo o adaptador na lista
        list_view_produtos.adapter = produtosAdapter

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {
            val produto = txt_produto.text.toString() //pegando o valor digitado pelo usuário

            //produtosAdapter.add(produto) //enviando o item para a lista

            if (produto.isNotEmpty()) {
                produtosAdapter.add(produto) //enviando o item para a lista
                txt_produto.text.clear() //limpando a caixa de texto
            } else {
                txt_produto.error = "Preencha um valor"
            }
        }

        list_view_produtos.setOnItemLongClickListener{ adapterView: AdapterView<*>,
                                                       view: View, position: Int, id: Long ->

            val	item = produtosAdapter.getItem(position) //buscando o item clicado

            produtosAdapter.remove(item) // removendo o item clicado da lista
            
            true //retorno indicando que o click foi realizado com sucesso

        }
    }
}