package com.fal.tutkusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fal.tutkusu.Falbaktir.FalMenu
import com.fal.tutkusu.GunlukBurc.GunlukBurcMenu
import com.fal.tutkusu.TarotFali.TarotFaliMenu
import com.fal.tutkusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        // onClickListener ekliyoruz
        binding.linearcard1.setOnClickListener {
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, FalMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }

        binding.linearcard2.setOnClickListener{
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, GunlukBurcMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }

        binding.linearcard3.setOnClickListener{
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, TarotFaliMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}