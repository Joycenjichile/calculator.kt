package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    lateinit var tilFirst:TextInputLayout
    lateinit var tilSecond:TextInputLayout
    lateinit var etNumberOne: EditText
    lateinit var etNumberTwo: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResults:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirst=findViewById(R.id.tilFirst)
        tilSecond=findViewById(R.id.tilSecond)
        etNumberOne = findViewById(R.id.etNumberOne)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResults = findViewById(R.id.tvResults)

        btnAdd.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()
            if (num1.isBlank()){
                etNumberOne.error="Number is required"
               return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error="Number is required"
                return@setOnClickListener
            }
            addition(num1.toInt(), num2.toInt())
        }

        btnSubtract.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()
            if (num1.isBlank()){
                etNumberOne.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error="Number is required"
                return@setOnClickListener
            }
            Subtract(num1.toInt(), num2.toInt())

        }
        btnMultiply.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()
            if (num1.isBlank()){
                etNumberOne.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error="Number is required"
                return@setOnClickListener
            }
            Multiply(num1.toInt(), num2.toInt())

        }
        btnModulus.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()
            if (num1.isBlank()){
               etNumberOne.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error="Number is required"
                return@setOnClickListener
            }
            Modulus(num1.toInt(), num2.toInt())

        }
    }

    fun addition(num1: Int, num2: Int) {
        var add = num1 + num2
        tvResults.text = add.toString()

    }

    fun Subtract(num1: Int, num2: Int) {
        var add = num1 + num2
        tvResults.text = add.toString()


    }

    fun Multiply(num1: Int, num2: Int) {
        var add = num1 + num2
        tvResults.text = add.toString()
    }

    fun Modulus(num1: Int, num2: Int) {
        var add = num1 + num2
        tvResults.text = add.toString()
    }
}