package com.example.glory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButton : AppCompatActivity() {

    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var difference: Button
    lateinit var product: Button
    lateinit var quotient: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        number1=findViewById(R.id.num1)
        number2=findViewById(R.id.num2)
        image=findViewById(R.id.imgbtn)
        difference=findViewById(R.id.minus)
        product=findViewById(R.id.multiply)
        quotient=findViewById(R.id.divide)

        //Addition
        image.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }
            else{
                val num1=Integer.parseInt(number1.text.toString())
                val num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "Sum of two numbers is "+(num1+num2),Toast.LENGTH_LONG).show()
            }
        }

        //Product
        product.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }
            else{
                val num1=Integer.parseInt(number1.text.toString())
                val num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "Product of two numbers is "+(num1*num2), Toast.LENGTH_LONG).show()
            }
        }

        //Subtraction
        difference.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }
            else{
                val num1=Integer.parseInt(number1.text.toString())
                val num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "The difference of two numbers is "+(num1-num2),
                    Toast.LENGTH_LONG).show()
            }
        }

        //Quotient
        quotient.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }
            else{
                val num1=Integer.parseInt(number1.text.toString())
                val num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "The quotient of two numbers is "+(num1/num2),
                    Toast.LENGTH_LONG).show()
            }
        }


    }
}