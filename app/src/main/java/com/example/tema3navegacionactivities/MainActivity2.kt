package com.example.tema3navegacionactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tema3navegacionactivities.databinding.ActivityMain2Binding
import com.example.tema3navegacionactivities.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val myTexto: String? = intent.extras?.getString("texto")
        binding.texto.text = myTexto

        binding.botonHome.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("texto", myTexto)
            startActivity(intent)
        }
    }
}