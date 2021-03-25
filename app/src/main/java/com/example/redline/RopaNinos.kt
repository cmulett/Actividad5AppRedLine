package com.example.redline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ropa_mujeres.*
import kotlinx.android.synthetic.main.activity_ropa_ninos.*

class RopaNinos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ropa_ninos)

        flechablanca3.setOnClickListener {
            val regresoflecha3: Intent = Intent(this, MainActivity::class.java)
            startActivity(regresoflecha3)
        }
    }
}