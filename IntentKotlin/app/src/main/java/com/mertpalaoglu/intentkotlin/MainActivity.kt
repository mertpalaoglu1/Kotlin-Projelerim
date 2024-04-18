package com.mertpalaoglu.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertpalaoglu.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // Class X :AppCompatActivity() özellikleri taşıyan bir sınıf demek.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    "On create ilk defa çalışınca açılıyor, farklı aktiviteye geçince tekrar çalışmıyor."
        println("onCreate executed")
    }

    override fun onStart() {
        super.onStart()
        println("onStart executed")
        binding.editText.setText("") //geri döndüğünde editTexti silsin diye buraya koyduk.
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executed")
    }

    fun next (view: View){
        //intent ile farklı uygulamaları da açıp aksiyonlar verebilirsin.
        /*::function vs diyerek o fonksiyona referans verebiliyorum.
        Intent context ve class olarak nereye gideceğini soruyor.*/
        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name" , binding.editText.text.toString()) //bunun ile diğer aktiviteye gönderebiliyoruz.
        intent.putExtra("myInteger",32) //statik değer de yollanıyor.
        startActivity(intent) //aktivite içinde olduğumuz için hazır kullanımlı fonksiyon. Diğer aktiviteyi başlatıyoruz.
        finish() //bu aktiviteyi kapatacak ve on destroy çalışacak. Swipe ile geri gelemezsin ama bunu komple kapayacak.
    }
}