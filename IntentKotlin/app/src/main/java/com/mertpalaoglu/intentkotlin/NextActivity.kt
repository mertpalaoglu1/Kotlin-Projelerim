package com.mertpalaoglu.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertpalaoglu.intentkotlin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*ekranlar arası veri aktarımı*/
        val IntentFromMain = intent //getIntent()
        val myName =IntentFromMain.getStringExtra("name") //tipini yazıyorsun alacağın verinin.
        val myInteger=IntentFromMain.getIntExtra("myInteger",-1)
        binding.nameText.text="Name: ${myName}" //aldığımız şeyi koyduk text'e koyduk.
    }

    fun previous(view:View){
        val intent = Intent(this@NextActivity,MainActivity::class.java)
        startActivity(intent) //tuşa basılınca ilk aktiviteye gidicek. On create bir daha çağırılacak.
        finish()

    //bunlar kural değil tabi istediğin şekilde uygulama aktivitelerin çalışabilir.
        //yaşam döngüsünü öğrendikten sonra uygulama ona göre düzenlenir.
    }
}