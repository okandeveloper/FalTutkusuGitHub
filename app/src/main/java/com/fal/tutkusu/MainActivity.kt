package com.fal.tutkusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fal.tutkusu.ui.TarotFaliMenu
import com.fal.tutkusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        //TODO: use navigation instead of intent

        binding.linearcard1.setOnClickListener {
            //val intent = Intent(this, FalMenu::class.java)
            //startActivity(intent)
        }

        binding.linearcard2.setOnClickListener {
            // val intent = Intent(this, GunlukBurcMenu::class.java)
            // startActivity(intent)
        }

        binding.linearcard3.setOnClickListener {
            val intent = Intent(this, TarotFaliMenu::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}