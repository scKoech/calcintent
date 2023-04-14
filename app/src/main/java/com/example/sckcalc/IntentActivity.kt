package com.example.sckcalc

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var buttonsms:Button
    lateinit var buttondial:Button
    lateinit var buttoncall:Button
    lateinit var buttoncamera:Button
    lateinit var buttonmpesa:Button
    lateinit var buttonshare:Button
    lateinit var buttonemail:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        buttonsms=findViewById(R.id.sms_bttn)
        buttoncall=findViewById(R.id.call_bttn)
        buttoncamera=findViewById(R.id.Camera_bttn)
        buttondial=findViewById(R.id.dial_bttn)
        buttonmpesa=findViewById(R.id.mpesa_bttn)
        buttonshare=findViewById(R.id.share_bttn)
        buttonemail=findViewById(R.id.email_bttn)

        buttonsms.setOnClickListener {
            val uri=Uri.parse("smsto:084748393")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Hello","Good morning")
            startActivity(intent)

        }

        buttoncamera.setOnClickListener {
            val takeapic=Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takeapic,1)
        }
        buttoncall.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL, Uri.parse("tell"+"+2546383993"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity, android.Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity, arrayOf(android.Manifest.permission.CALL_PHONE), 1
                )
            }else{
                startActivity(intent)
            }

        }
        buttondial.setOnClickListener {
            val nambari1="25476453572"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", nambari1, null))
            startActivity(intent)
        }
        buttonmpesa.setOnClickListener {
            val simtoolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simtoolKitLaunchIntent?.let { startActivity(it) }
        }
        buttonshare.setOnClickListener {
            val shareintent=Intent(Intent.ACTION_SEND)
            shareintent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareintent.type="text/plain"
            shareintent.putExtra(Intent.EXTRA_TEXT,"HI CLICK TO DOWNLOAD")
            startActivity(shareintent)
        }
        buttonemail.setOnClickListener {
            val emailintent=Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","cheropkoech04@gmail.com",null))
            emailintent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailintent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emailintent,"send email..."))
        }


    }
}