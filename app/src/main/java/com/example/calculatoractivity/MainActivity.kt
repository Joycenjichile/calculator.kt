package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumberone:EditText
    lateinit var etNumberTwo:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumberone=findViewById(R.id.etNumberOne)
        etNumberTwo=findViewById(R.id.etNumberTwo)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
    }
}