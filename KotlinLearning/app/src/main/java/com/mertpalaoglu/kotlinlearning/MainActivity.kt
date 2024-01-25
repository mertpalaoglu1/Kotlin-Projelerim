package com.mertpalaoglu.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello Kotlin!") // metin olduğunu anladı tırnak içinde.
        println(4*5) /* println içinde integer işlemler de yapılabilir. */

        //variables
        var x=5
        var y=4
        val result = (x*y)/5
        println (result)

        x=32 //x ve y'nin değeri değişti.
        y=12
        println(x+y)

        //constants
        val isim = "Mert"

        //defining and initializing

        //Byte,Short,Int,Long sayı değişken tipi olarak kullanılabilir.

        val myInteger : Int
        myInteger= 10

        val myFloat =3.14f

        val myDouble: Double
        myDouble=19.1

        val pi = 3.14 //Otomatik double atar.
        println(pi*2)

        val myString :String = "mert Palaoğlu"
        val name="Mert"
        val surname="Palaoglu"
        val fullName= name + " " +surname //string toplaması
        println(fullName)

        println(myString.capitalize()) //ilk harfi büyütür.

        var myBooelan :Boolean = false
        println(5>1 && 4!=6) //true gelir. (!= eşit değildir.)

        //Converting to another data type

        var myNumber = 5
        var myLongNumber = myNumber.toLong()

        var input = "10" //kullanıcıdan string aldık.
        println(input.toInt() * 2)//int'e çevirdik ve çarptık gibi.

       //Collections

        val myArray = arrayOf("Mert","Tuğra","Faruk","Ömer")
        println(myArray[0])
        myArray[0]="Mert Palaoğlu" //değişim yapabiliyorsun.
        println(myArray[0])
        println(myArray)
        val mixedArray = arrayOf("Mert",19) //karışık tipli any arrayler de olabiliyor.

        //Set
        /*Bir eleman sadece bir defa kullanılabilir içinde. */

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("first element: ${myExampleArray[0]} ") //"Example_1 =${ }" formatlı yazma böyle yapılır.
        println("second element: ${myExampleArray[1]} ")

        val mySet= setOf<Int>(1,1,2,3)
        println(mySet.size) //3 çıkarır çünkü her farklı elemanı sayar.

        //for Each
        mySet.forEach{println( it*3 )} //her elemanı alacak sırayla ama tekrarlananları tekrar almayacak. it denilen ise seçtiği her değişkeni tanımlamak için kullanılan.

        val myStringSet= HashSet<String>() //boş olarak oluşturduk.
        myStringSet.add("Mert")
        myStringSet.add("Mert")
        println(myStringSet.size) //1 yazacak.

        //Map - HashMap
        /*Dizileri ya da verileri birbiri ile eşleştirme şansı verir.
        Key- Value şekli */
        val fruitArray= arrayOf("Elma","Muz")
        val caloriesArray= arrayOf("100","150")

        println("${fruitArray[0]} = ${caloriesArray[0]}")
        //iki ayrı dizi yaratmak yerine map yaratıyoruz. İnternetten veriyi böyle çekeriz.

        val fruitCalorieMap = hashMapOf<String,Int>() //key value.
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"]) // Key ile çağırdık.

        val myHashMap= hashMapOf<String, String>("A" to "1", "B" to "C" ) //farklı bir şekilde oluşturma.

        //Operator

        var m=5
        m=m+1
        println(m)
        m++
        println(m)
        m-- // 1 çıkartıyor.
        println(m<13)

         // && ve operatorü
         // || veya operatörü

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)
        println(10%2) //(remaninder) kalanı verir.


        //If Control
        val age= 19
        if(age<30) {
              println("<30")
        }
        else if(age==30){
            println("=30")
        }
        else { //hiçbiri tutmazsa bunu yapar.
            println(">30")
        }

        //Switch-When yapısı.

        val day = 3
        var dayString= ""

           /* if(day == 1){
             dayString = "Monday"
            }
            else if (day==3){
                dayString= "Wednesday"
            }*/
        when(day){
            1 -> dayString="Monday"
            2 -> dayString="Tuesday"
            2 -> dayString="Wednesday"
            else -> dayString=""
        }
        println(dayString)

        //Döngüler(Loops)

        //For Loop
        val myArrayOfNumber = arrayOf(12,24,36,48,54,69,72,81)
        var q= myArrayOfNumber[0]/3 * 5
        println(q)

        for (number in myArrayOfNumber){
            val q=number/3 * 5
            println(q)
        }

        for(i in myArrayOfNumber.indices){
            val qz=myArrayOfNumber[i] / 3 * 5
            println(qz)
        }

        for(b in 0..9){
            println(b)
        }

        //Stringlerde de çalışır. For each gibi.
        val myStringArrayList =ArrayList<String>()
        myStringArrayList.add("Mert")
        myStringArrayList.add("Palaoglu")
        myStringArrayList.add("Melisa ")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach{println(it)}//aynı işlemi yapıyor.

        //When Loop
        var j=0
        while (j<10)  {
             println(j)
            j++ }
    }
}