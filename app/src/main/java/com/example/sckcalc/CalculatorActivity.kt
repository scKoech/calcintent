package com.example.sckcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsub:Button
    lateinit var buttonmultipy:Button
    lateinit var buttondivide:Button

    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Tv_answer=findViewById(R.id.Answer_txt)
        edt_firstnumber=findViewById(R.id.FirstNum_txt)
        edt_secondnumber=findViewById(R.id.SecondNum_txt)
        buttonadd=findViewById(R.id.Addition_btn)
        buttonsub=findViewById(R.id.Subtraction_btn)
        buttonmultipy=findViewById(R.id.Multiply_btn)
        buttondivide=findViewById(R.id.Division_bttn)

        buttonadd.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill in all inputs"

            }else {
                //let's now calculate
                var answer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        buttonsub.setOnClickListener {
            var myfirstnumber =edt_firstnumber.text.toString()
            var mysecondnumber =edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill in all inputs"

            }else {
                //let's now calculate
                var answer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        buttonmultipy.setOnClickListener {
            var myfirstnumber =edt_firstnumber.text.toString()
            var mysecondnumber =edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill in all inputs"

            }else {
                //let's now calculate
                var answer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        buttondivide.setOnClickListener {
            var myfirstnumber =edt_firstnumber.text.toString()
            var mysecondnumber =edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill in all inputs"

            }else {
                //let's now calculate
                var answer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
    }
}