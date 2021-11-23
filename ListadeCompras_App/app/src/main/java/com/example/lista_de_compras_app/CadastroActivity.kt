package com.example.lista_de_compras_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import    kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {

            //pegando os valores digitados pelo usuário
            val produto = txt_produto.text.toString()
            val qtd = txt_qtd.text.toString()
            val valor = txt_valor.text.toString()


            //verificando sse o usuário digitou algum valor
            if (produto.isNotEmpty() && qtd.isNotEmpty() && valor.isNotEmpty()) {
                val prod = Produto(produto, qtd.toInt(), valor.toDouble())
                produtosGlobal.add(prod)

                //limpando a caixa de texto
                txt_produto.text.clear()
                txt_qtd.text.clear()
                txt_valor.text.clear()
            } else {
                txt_produto.error = if (txt_produto.text.isEmpty()) "Preencha o nome do produto" else null
                txt_qtd.error = if (txt_qtd.text.isEmpty()) "Preencha a quantidade de produtos" else null
                txt_valor.error = if (txt_valor.text.isEmpty()) "Preencha o valor do produto" else null

            }


            /*else {
                if (txt_produto.text.isNotEmpty()) {
                    txt_produto.error = "Preencha o nome do produto"
                } else {
                    txt_produto.error = null
                }
                if (txt_qtd.text.isNotEmpty()) {
                    txt_qtd.error = "Preencha a quantidade de produtos"
                } else {
                    txt_qtd.error = null
                }
                if (txt_valor.text.isNotEmpty()) {
                    txt_valor.error = "Preencha o valor"
                } else {
                    txt_valor.error = null
                }
            }*/
        }
    }
}