package com.mertpalaoglu.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var result: TextView
private lateinit var addButton: Button
private lateinit var subButton: Button
private lateinit var multButton: Button
private lateinit var divButton: Button
private lateinit var numberOne: EditText
private lateinit var numberTwo: EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result=findViewById(R.id.result)
        addButton=findViewById(R.id.addButton)
        subButton=findViewById(R.id.subButton)
        multButton=findViewById(R.id.multButton)
        divButton=findViewById(R.id.divButton)
        numberOne=findViewById(R.id.numberOne)
        numberTwo=findViewById(R.id.numberTwo)

        addButton.setOnClickListener{
            var x= numberOne.text.toString().toDoubleOrNull()
            var y= numberTwo.text.toString().toDoubleOrNull()
            if (x != null && y != null) {
                result.text = "Result is ${(x + y)}"
            } else {
                result.text = "Enter your numbers properly"
            }
       }
        subButton.setOnClickListener{
            var x= numberOne.text.toString().toDoubleOrNull()
            var y= numberTwo.text.toString().toDoubleOrNull()
            if (x != null && y != null) {
                result.text = "Result is ${(x - y)}"
            } else {
                result.text = "Enter your numbers properly"
            }
        }
        multButton.setOnClickListener{
            var x= numberOne.text.toString().toDoubleOrNull()
            var y= numberTwo.text.toString().toDoubleOrNull()
            if (x != null && y != null) {
                result.text = "Result is ${(x * y)}"
            } else {
                result.text = "Enter your numbers properly"
            }
        }
        divButton.setOnClickListener{
            var x= numberOne.text.toString().toDoubleOrNull()
            var y= numberTwo.text.toString().toDoubleOrNull()
            if (x != null && y != null) {
                result.text = "Result is ${(x / y)}"
            } else {
                result.text = "Enter your numbers properly"
            }
        }

    }
}
/*fun addFunc(myView: View) {
    var x= numberOne.text.toString().toDoubleOrNull()
    var y= numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
        result.text = "Result is :${(x + y)}"
    } else {
        result.text = "Enter your numbers properly"
    }
}
fun subFunc(myView: View){
    var x= numberOne.text.toString().toDoubleOrNull()
    var y= numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
    result.text = "Result is :${(x - y)}"
} else {
    result.text = "Enter your numbers properly"
    }
}
fun multiplyFunc(myView: View){
    var x= numberOne.text.toString().toDoubleOrNull()
    var y= numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
    result.text = "Result is :${(x * y)}"
} else {
    result.text = "Enter your numbers properly"
    }
}
fun divideFunc(myView: View){
    var x= numberOne.text.toString().toDoubleOrNull()
    var y= numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
    result.text = "Result is :${(x / y)}"
} else {
    result.text = "Enter your numbers properly"
   }
}*/
