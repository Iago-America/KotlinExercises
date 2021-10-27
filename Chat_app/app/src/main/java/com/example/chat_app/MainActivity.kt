package com.example.chat_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button.setOnClickListener{
            val message = message_edittext.text.toString()
            message_edittext.setText("") //setText -> Para colocar o espaço vazio
            message_textview.text = message //Aqui estamos modificando a propriedade text.
        }
    }
}