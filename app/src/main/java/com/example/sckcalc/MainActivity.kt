package com.example.sckcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
        lateinit var Buttoncalc: Button
        lateinit var Buttonintent: Button
        lateinit var ButtonWeb: Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            Buttoncalc = findViewById(R.id.Btn_cal)
            Buttonintent = findViewById(R.id.Btn_int)
            ButtonWeb = findViewById(R.id.Btn_web)
            Buttoncalc.setOnClickListener {
                val intent=Intent(this,CalculatorActivity::class.java)
                startActivity(intent)
            }
            ButtonWeb.setOnClickListener {
                val intent=Intent(this,WebActivity::class.java)
                startActivity(intent)
            }
            Buttonintent.setOnClickListener {
                val intent=Intent(this,IntentActivity::class.java)
                startActivity(intent)
            }
        }
}