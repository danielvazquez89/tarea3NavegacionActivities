package com.example.tema3navegacionactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        getSupportActionBar()?.setSubtitle("El mejor curso de Android del MUNDO!")
    }
}