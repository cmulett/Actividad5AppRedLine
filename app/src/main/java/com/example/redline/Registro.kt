package com.example.redline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        click_BotonInicio()
        click_BotonRegistro()
    }

    fun click_BotonInicio(){
        btnInicia.setOnClickListener() {
            Toast.makeText(applicationContext, "Has Iniciado Sesión Correctamente, Puedes Disfrutar de Nuestros Descuentos!!", Toast.LENGTH_LONG).show()
        }
    }

    fun click_BotonRegistro(){
        btnregis.setOnClickListener() {
            Toast.makeText(applicationContext, "Se ha Registrado Correctamente, Puedes Disfrutar de Nuestros Descuentos!!", Toast.LENGTH_LONG).show()
        }
    }
}