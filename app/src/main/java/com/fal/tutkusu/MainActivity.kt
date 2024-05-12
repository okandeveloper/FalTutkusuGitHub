package com.fal.tutkusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fal.tutkusu.databinding.ActivityMainBinding
import com.fal.tutkusu.TarotFali.TarotFaliMenu

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // linearcard1 ID'sine sahip view'i buluyoruz
        val linearCard1 = binding.linearcard1
        val linearCard2 = binding.linearcard2
        val linearCard3 = binding.linearcard3

        // onClickListener ekliyoruz
        linearCard1.setOnClickListener {
            // İstenilen işlemi buraya yazabilirsiniz
        }

        linearCard2.setOnClickListener {
            // İstenilen işlemi buraya yazabilirsiniz
        }

        linearCard3.setOnClickListener {
            val intent = Intent(this, TarotFaliMenu::class.java)
            startActivity(intent)
        }
    }
}
