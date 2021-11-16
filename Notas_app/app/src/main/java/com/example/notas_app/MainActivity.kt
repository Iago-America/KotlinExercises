package com.example.notas_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notas_app.databinding.ActivityMainBinding
import com.example.notas_app.databinding.ActivityMainBinding.inflate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val btcalcular = binding.calcular.text.toString()
        val resultadp =  binding.resultado.text.toString()

        binding.calcular.setOnClickListener{


            val nota1 = binding.nota1.text.toString().toFloat()
            val nota2 = binding.nota2.text.toString().toFloat()
            val media = (nota1 + nota2)/2
            val faltas1 = binding.faltas.text.toString().toFloat()

            if(media >= 6 && faltas1 <= 10) {
                binding.resultado.text = "Aluno foi aprovado\n" + "Nota final:" + media
                binding.resultado.setTextColor(Color.GREEN)
            } else {
                binding.resultado.text = "Aluno reprovado\n" + "Nota final:" + media
                binding.resultado.setTextColor(Color.RED)
            }
        }
    }
}