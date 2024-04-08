package com.mertpalaoglu.alertdialogpractice

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1) Toast 2) AlertDialog 3) Snackbar

        //context
        //Activity Context -> this
        //Application Context-> ApplicationContext

        Toast.makeText(this@MainActivity, "Hosgeldiniz",Toast.LENGTH_LONG).show() //this direkt  yazarsan da mainactivity'e atar.

    }

    fun save (view: View)  { //buton için yazılan fonksiyon
    val alert = AlertDialog.Builder(this) //this@MainActivity
        alert.setTitle("Kayıt Et")
        alert.setMessage("Emin misiniz?")


        /*obje bir arayüz, arayüz sana fonksiyonu uygulatıyor, p0 ve p1 değişkenlerini alıyor. Biz de almak zorundayız. P1 hangisinin tıklandığı(which), p0 değişkenin ne olduğu, tipini (dialog) */
        alert.setPositiveButton("Evet",object :DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
              Toast.makeText(this@MainActivity,"Kayıt Edildi!",Toast.LENGTH_LONG).show()
            }
        }) // pozitif butonda kayıt edildi çıkıyor toast olarak.
        //iki stili var üstteki gibi veya alttaki gibi.


        alert.setNegativeButton("Hayır"){ dialog, which ->
            Toast.makeText(this@MainActivity,"Kayıt Edilmedi!",Toast.LENGTH_LONG).show()
        }
        // negatif butonda kayıt edilmedi çıkıyor toast olarak.
        alert.show()
    }


}