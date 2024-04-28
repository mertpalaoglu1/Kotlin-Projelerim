package com.mertpalaoglu.countdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.mertpalaoglu.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract- Interface - Inheritance
//soyut sınıfı uygulamak için object kullanılır. iki parametrenin biri kaçtan başlayacağı diğer ise kaçar kaçar geri sayacağını ifade eder. ms cinsindedir.
        object : CountDownTimer(10000,1000) {
            override fun onTick(p0: Long) { //p0 kaç saniye kaldığını veriyor. ms olarak
                binding.textView.text= "Left: ${(p0 / 1000).toInt()}"
            }

            override fun onFinish() {
                binding.textView.text= "Left: 0, program finished. "
            }

        }.start()
    }
}