package com.example.redline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_ropa__hombres.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_BotonHombres()
        click_BotonMujeres()
        click_BotonNinos()
        click_BotonRegistro()

        }
        fun click_BotonHombres(){
            btnHombres.setOnClickListener {
                val ventanaHombres: Intent= Intent(applicationContext,RopaHombres::class.java)
                startActivity(ventanaHombres)
            }
        }
        fun click_BotonMujeres(){
             btnMujeres.setOnClickListener {
            val ventanaMujeres: Intent= Intent(applicationContext,RopaMujeres::class.java)
            startActivity(ventanaMujeres)
        }
    }
        fun click_BotonNinos(){
             btnNinos.setOnClickListener {
            val ventanaNinos: Intent= Intent(applicationContext,RopaNinos::class.java)
            startActivity(ventanaNinos)
        }
    }
         fun click_BotonRegistro(){
             btnRegist1.setOnClickListener {
            val ventanaRegistro: Intent= Intent(applicationContext,Registro::class.java)
            startActivity(ventanaRegistro)
        }
    }

}