package com.mertpalaoglu.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertpalaoglu.kotlincalculator.databinding.ActivityMainBinding

//Added view binding.

/*private lateinit var result: TextView
private lateinit var addButton: Button
private lateinit var subButton: Button
private lateinit var multButton: Button
private lateinit var divButton: Button
private lateinit var numberOne: EditText
private lateinit var numberTwo: EditText*/


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //for number 1 and number 2 inputs
    var x : Double? =null
    var y : Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // OnClick Function added.

       /* result=findViewById(R.id.result)
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
        }*/

    }

fun addFunc(myView: View) {
    this.x= binding.numberOne.text.toString().toDoubleOrNull()
    this.y= binding.numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
        binding.result.text = "Result is :${(x!! + y!!)}"
    } else {
        binding.result.text = "Enter your numbers properly !"
    }
}
fun subFunc(myView: View){
    this.x= binding.numberOne.text.toString().toDoubleOrNull()
    this.y= binding.numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
    binding.result.text = "Result is :${(x!! - y!!)}"
}   else {
    binding.result.text = "Enter your numbers properly !"
    }
}
fun multiplyFunc(myView: View){
     this.x= binding.numberOne.text.toString().toDoubleOrNull()
     this.y= binding.numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
        binding.result.text = "Result is :${(x!! * y!!)}"
}   else {
        binding.result.text = "Enter your numbers properly !"
    }
}
fun divideFunc(myView: View){
     this.x= binding.numberOne.text.toString().toDoubleOrNull()
     this.y= binding.numberTwo.text.toString().toDoubleOrNull()
    if (x != null && y != null) {
        binding.result.text = "Result is :${(x!! / y!!)}"
}   else {
        binding.result.text = "Enter your numbers properly !"
   }
}

}