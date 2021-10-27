package com.example.aposentadoria_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        //acessando a caixa de idade
        val txt_idade = findViewById<EditText>(R.id.txt_idade)
        //acessando o botão de calcular
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        //acessando o texto de resultado
        val  txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout
            .simple_spinner_dropdown_item, listOf("Masculino", "Feminino"))

        btn_calcular.setOnClickListener() /* Aqui vai o código que será executado
        quando houver um click no botão */ {
            //acessando spinner

            val sexo = spn_sexo.selectedItem as String // Garente o retorno de uma string

            val idade = txt_idade.text.toString().toInt() /* O retorno da propriedade text do
        EditText não é diretamente uma String, mas sim um Editable, sendo necessário transformar
        em String e depois Int */

            var resultado = 0
            if (sexo ==  "Masculino"){
                resultado = 65 - idade
            } else {
                resultado = 60 - idade
            }

            txt_resultado.text = "Faltam $resultado anos para você se aposentar"
        }


    }
}