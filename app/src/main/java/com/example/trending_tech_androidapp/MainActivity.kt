package com.example.trending_tech_androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letsGo = findViewById<Button>(R.id.letsGoButton)
        letsGo.setOnClickListener {
            //opening a new activity
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}