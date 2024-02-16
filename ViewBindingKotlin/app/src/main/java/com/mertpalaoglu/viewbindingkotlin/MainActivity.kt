package com.mertpalaoglu.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertpalaoglu.viewbindingkotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //Xml ile kodları birbirine bağlamaya çalışıyor.
        val view = binding.root //görünümü alıyor
        setContentView(view) //o görünümü kullanıyor.
        //artık binding. yazdığımızda her widget'a ıd ile erişebileceğiz.
        binding.button.setOnClickListener{}
        binding.textView.text="Test"
        binding.editText.setText("edit text test ")

    }
}