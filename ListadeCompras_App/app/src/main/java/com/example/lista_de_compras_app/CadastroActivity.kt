package com.example.lista_de_compras_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import	kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {
            val produto = txt_produto.text.toString() //pegando o valor digitado pelo usuário

            if (produto.isNotEmpty()) {
                //enviando o item para a lista
                txt_produto.text.clear() //limpando a caixa de texto
            } else {
                txt_produto.error = "Preencha um valor"
            }
        }
    }
}