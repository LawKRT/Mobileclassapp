package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttoncalculator: Button
    lateinit var buttonintent: Button
    lateinit var buttonweb: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttoncalculator=findViewById(R.id.btn_calc)
        buttonintent=findViewById(R.id.btn_intent)
        buttonweb=findViewById(R.id.btn_web)


        buttoncalculator.setOnClickListener {

            val calc=Intent(this,CalculatorActivity2::class.java)
            startActivity(calc)

        }

        buttonweb.setOnClickListener {
            val webs=Intent(this, WebActivity2::class.java)
            startActivity(webs)
        }


        buttonintent.setOnClickListener {
            val inte=Intent(this,IntentActivity2::class.java)
            startActivity(inte)
        }


















    }
}

