package com.example.redline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ropa__hombres.*
import kotlinx.android.synthetic.main.activity_ropa_mujeres.*

class RopaMujeres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ropa_mujeres)

        flechablanca2.setOnClickListener {
            val regresoflecha2: Intent = Intent(this, MainActivity::class.java)
            startActivity(regresoflecha2)
        }
    }
}