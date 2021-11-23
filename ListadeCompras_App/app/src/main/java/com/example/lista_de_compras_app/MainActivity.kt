package com.example.lista_de_compras_app

import android.content.Intent
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


        btn_adicionar.setOnClickListener() {
            //Criando a Intent explícita
            val intent = Intent(this, CadastroActivity::class.java)

            //iniciando  a atividade
            startActivity(intent)
        }

        override fun onResume() {
            super.onResume()
            val	adapter = list_view_produtos.adapter as ProdutoAdapter
            adapter.clear()
            produtosAdapter.addAll(produtosGlobal)
        }

        //Implementação do adaptador
        val produtosAdapter = ProdutoAdapter(this)

        //definindo o adaptador na lista
        list_view_produtos.adapter = produtosAdapter


        list_view_produtos.setOnItemLongClickListener { adapterView: AdapterView<*>,
                                                        view: View, position: Int, id: Long ->

            val item = produtosAdapter.getItem(position) //buscando o item clicado

            produtosAdapter.remove(item) // removendo o item clicado da lista

            true //retorno indicando que o click foi realizado com sucesso

        }


    }
}