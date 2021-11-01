package com.example.lista_de_compras_app

import android.graphics.Bitmap

data class Produto (val nome: String, val quantidade: Int,
                    val valor: Double, val foto: Bitmap? = null) {

}