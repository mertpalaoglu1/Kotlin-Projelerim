package com.mertpalaoglu.storingdata

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertpalaoglu.storingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //view binding kısmı için.
    private lateinit var sharedPref : SharedPreferences //üstte tanımladık ki altlarda kullanılacak.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Shared Preferences - XML - Key-Value
       sharedPref= this.getSharedPreferences("com.mertpalaoglu.storingdata" , MODE_PRIVATE) //XML'in ismini ve modunu girdik.

       val userAgePref = sharedPref.getInt("myAge" , -1) //aldığı key ve default değer.
        if(userAgePref==-1){
           binding.textView.text= "Your Age:" //veri yoksa boş gözükecek.
       }
       else{
           binding.textView.text= "Your Age: ${userAgePref}" //veri varsa onu gösterir.
       }
    }

    fun save(view : View){
        val myAge = binding.editText.text.toString().toIntOrNull()
        if (myAge!=null){
        binding.textView.text="Your age : ${myAge}" // binding.textView.text="Your age :" +myAge
        sharedPref.edit().putInt("myAge",myAge).apply() //tuşa basılınca kaydedecek bu anahtar ile.
        }
    }

    fun delete (view: View){
        sharedPref.edit().remove("myAge").apply() //tuşa basılınca anahtarda kaydedilen veriyi silecek.
        binding.textView.text= "Your Age:"
    }
}