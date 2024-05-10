package com.fal.tutkusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fal.tutkusu.Falbaktir.FalMenu
import com.fal.tutkusu.GunlukBurc.GunlukBurcMenu
import com.fal.tutkusu.TarotFali.TarotFaliMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // linearcard1 ID'sine sahip view'i buluyoruz
        val linearCard1 = findViewById<View>(R.id.linearcard1)
        val linearCard2 = findViewById<View>(R.id.linearcard2)
        val linearCard3 = findViewById<View>(R.id.linearcard3)

        // onClickListener ekliyoruz
        linearCard1.setOnClickListener {
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, FalMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }
        linearCard2.setOnClickListener {
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, GunlukBurcMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }
        linearCard3.setOnClickListener {
            // FalMenu ekranına geçmek için bir Intent oluşturuyoruz
            val intent = Intent(this, TarotFaliMenu::class.java)
            // Intent'i başlatıyoruz
            startActivity(intent)
        }




    }
}