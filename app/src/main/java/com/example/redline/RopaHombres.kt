package com.example.redline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ropa__hombres.*
import kotlinx.android.synthetic.main.activity_ropa__hombres.view.*

class RopaHombres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ropa__hombres)

        flechablanca.setOnClickListener {
            val regresoflecha: Intent= Intent(this, MainActivity::class.java)
            startActivity(regresoflecha)
        }


    }
}