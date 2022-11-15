package com.example.tema3navegacionactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tema3navegacionactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.botonAdelante.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("texto", binding.editText.text.toString())
            startActivity(intent)
        }
    }
}