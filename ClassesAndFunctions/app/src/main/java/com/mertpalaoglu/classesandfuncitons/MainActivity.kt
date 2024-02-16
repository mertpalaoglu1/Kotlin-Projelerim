package com.mertpalaoglu.classesandfuncitons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //başlarına private koyduk çünkü diğer aktivitelerden ulaşmak istemiyorum.
    private lateinit var myTextView: TextView //önden tipini tanımlıyoruz ama eşittirini yapmıyoruz. Sonradan initalize edeceğiz. OnCreate'de kullanıcının göreceği bir kısım olduğu için.
    private lateinit var myButton: Button
    private lateinit var nameText: EditText
    private lateinit var jobText: EditText
    private lateinit var ageText: EditText
    private var name= ""

    override fun onCreate(savedInstanceState: Bundle?) { //Hazır Tanımlı Fonksiyon.

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myTextView= findViewById<TextView>(R.id.textView) //koyduğumuz textView'a id ile ulaştık. tekrar tipini yazmamıza gerek yok <> içine.
         myButton=findViewById(R.id.button)
         nameText=findViewById(R.id.nameText)
         ageText=findViewById(R.id.ageText)
         jobText=findViewById(R.id.jobText)


        // Functions are good because = 1)Code block, 2)reusable, 3) input, 4) output-return.

       /* Butona  bir fonksiyon atamanın diğer yolu.
            myButton.setOnClickListener{
                myTextView.text="Button Clicked 2"
            }*/


        //fonksiyonlar on create'de çağırılıyor.
        test()
        mySum(12,3)
        val sumResult = mySum(5,35)
        val multiplicationResult = myMultiply(16,3) //Değere dönebiliyor.
        println(sumResult) //kotlin.Unit döndürecek ama textView'i değiştiriyor hala.
        println(multiplicationResult) //çarpmayı resulta döndürecek ve textView'i değiştirecek.


        //Class yapısı

        val homer = Simpson(name= "Homer Simpson", job= "Nuclear Base Worker", age= 50 ,) //simpson tipinde bir homer değişkeni açtık, Constructor belli değerleri istiyor.
        homer.name="Homer Simpson v2 " //buradan yine değiştirebiliyoruz.
        homer.setHeight(190)

        //Nullability

        var myString: String? //String veya null olabilir değer.
        myString=null
        //println(myString) uygulamayı çökertir.
        var myAge: Int?
        myAge=100
        // if (myAge!=null){}
        //println(myAge!! * 5) //!! ne olursa olsun çalıştır demek.
        println(myAge?.minus(10)) //?. null gelirse devam et yine de çalıştır.

        //elvis operator yöntemi ?:
        println(myAge?.minus(10) ?: -10) //eğer soldaki değer null ise sağındakini yazıyor.

        //let yöntemi
        myAge?.let { println(myAge?.minus(10)) } //myAge null değilse çalışır null ise girmez.

    }


    fun test() {
        println("Test Function")
        myTextView.text="test"
    }
    fun mySum(a:Int, b:Int){ //Bir şey döndürmeyecek ama işini yapıyor.
        myTextView.text= "Result: ${a+b}" //buradan da özelliklerine erişebiliyoruz ve textin içinde formatlı yazdık "${}" ile.
    }
    fun myMultiply(a: Int, b: Int): Int { //Bir şey döndüreceğini ve tipini süslü parantezden önce belli ediyoruz.
        myTextView.text="Multiply Result=${a*b}"
        return a * b //Return çalışınca bitirir fonksiyonu.
    }
    fun buttonClicked(myView: View){ //button içine fonksiyon atadık. Gelen parametre View tipinde.
        name=nameText.text.toString() //class altında tanımladım. Diğer fonksiyonlar altında da erişilebilir.
        var age = ageText.text.toString().toIntOrNull()
        var job = jobText.text.toString()
        if (age!=null){
            val simpson =Simpson(name, age, job)
            myTextView.text= "Name = ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"
        }
        else {
            myTextView.text="Enter your age properly!"
        }
    }

}