package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity2 : AppCompatActivity() {
    lateinit var buttonadd: Button
    lateinit var buttonsubtract: Button
    lateinit var buttonmod: Button
    lateinit var buttonmultiply: Button
    lateinit var editfnum: EditText
    lateinit var editSnum: EditText
    lateinit var TextAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)


        buttonadd=findViewById(R.id.Btn_add)
        buttonsubtract=findViewById(R.id.Btn_Subtract)
        buttonmod=findViewById(R.id.Btn_Mod)
        buttonmultiply=findViewById(R.id.Btn_Multiply)
        editfnum=findViewById(R.id.editTextNumber)
        editSnum=findViewById(R.id.editTextNumber2)
        TextAnswer=findViewById(R.id.Txt_Answer)


        buttonadd.setOnClickListener {
            var fnum=editfnum.text.toString()
            var Snum=editSnum.text.toString()

            if(fnum.isEmpty() && Snum.isEmpty()){

                TextAnswer.text= "Please fill in input details"
            }else {
                var Answer= fnum.toDouble() +Snum.toDouble()
                TextAnswer.text=Answer.toString()
            }

        }



        buttonsubtract.setOnClickListener {
            var fnum=editfnum.text.toString()
            var Snum=editSnum.text.toString()

            if(fnum.isEmpty() && Snum.isEmpty()){

                TextAnswer.text= "Please fill in input details"
            }else {
                var Answer= fnum.toDouble() -Snum.toDouble()
                TextAnswer.text=Answer.toString()
            }

        }

        buttonmod.setOnClickListener {
            var fnum=editfnum.text.toString()
            var Snum=editSnum.text.toString()

            if(fnum.isEmpty() && Snum.isEmpty()){

                TextAnswer.text= "Please fill in input details"
            }else {
                var Answer= fnum.toDouble() /Snum.toDouble()
                TextAnswer.text=Answer.toString()
            }

        }

        buttonmultiply.setOnClickListener {
            var fnum=editfnum.text.toString()
            var Snum=editSnum.text.toString()

            if(fnum.isEmpty() && Snum.isEmpty()){

                TextAnswer.text= "Please fill in input details"
            }else {
                var Answer= fnum.toDouble() *Snum.toDouble()
                TextAnswer.text=Answer.toString()
            }

        }








    }
}