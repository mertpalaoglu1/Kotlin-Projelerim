package com.mertpalaoglu.runnablekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.mertpalaoglu.runnablekotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number =0
    var runnable : Runnable = Runnable {} //obje oluşturur gibi değil de kod yazacak gibi boş bir obje oluşturduk.
    var handler : Handler = Handler(Looper.getMainLooper()) //runnable kullanılsın diye geliştirilmiş yapı

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

    }

    fun start(view:View){
        number =0
        runnable = object : Runnable{
            override fun run() {
                number+=1
                binding.textView.text="Time = ${number}"
                //1 sn  beklemesi lazım
                handler.postDelayed(runnable,1000) //Thread.sleep(1000) gibi çalışır, rötarlı olarak çalıştırır.
            }

        }
        handler.post(runnable) //runnable'ı başlatır.
        binding.button.isEnabled=false //starta bastıktan sonra tekrar tıklanmasın, yine thread oluşmasın diye.
    }

    fun stop(view: View){

        binding.button.isEnabled=true // start'a yeniden basılabilsin diye
        number=0
        binding.textView.text="Time = ${number}"
        handler.removeCallbacks(runnable) //runnable'ı durduruyor.

    }
}