package com.mertpalaoglu.classesandfuncitons
    //Primary Constructor
class Simpson(var name:String, var age: Int , var job: String) {

    private var height = 0 //sadece tanımlandığı sınıfın içinden erişilebilir. Main activityden sadece alttaki fonksiyona erişebilirsin.

        fun setHeight(num: Int){
        if(height>100) {
            height=num
        }
    }


   /* Secondary Constructor.
    var name = ""
    var age = 0
    var job = ""
    var weight=0.1

    //Secondary Constructor
    constructor(name:String,age:Int, job:String, weightInput:Double) { //genelde input olmaz direkt değişkenin isminin kendisi olur.
        this.name=name //this dediğimizde en üst kısmına class'a gider.
        this.age=age
        this.job=job
        weight=weightInput
    } Bu simpson sınıfından oluşturduğumuz her objede bu fonksiyon çağırılacak.
*/}


