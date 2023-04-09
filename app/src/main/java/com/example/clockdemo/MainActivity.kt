package com.example.clockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.clockdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.analogClock.setOnClickListener {
            Toast.makeText(this, "Analog Clock", Toast.LENGTH_SHORT).show()
        }
        binding.digitalClock.setOnClickListener {
            Toast.makeText(this, "Digital Clock", Toast.LENGTH_SHORT).show()
        }
    }
}