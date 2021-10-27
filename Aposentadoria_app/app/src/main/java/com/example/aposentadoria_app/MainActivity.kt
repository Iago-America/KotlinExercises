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

        //acessando spinner
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        //acessando a caixa de idade
        val txt_idade = findViewById<EditText>(R.id.txt_idade)
        //acessando o botão de calcular
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        //acessando o texto de resultado
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)


    }
}