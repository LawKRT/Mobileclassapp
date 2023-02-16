package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URL
import java.security.KeyStore.LoadStoreParameter

class WebActivity2 : AppCompatActivity() {
    lateinit var mywebviewyangu: WebActivity2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web2)

        mywebviewyangu=findViewById(R.id.webview)
    }
    fun webviewyangu(){
        mywebviewyangu.mywebviewyangu = webviewyangu()
        mywebviewyangu.apply{
            LoadUrl( url: "https://www.google.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (mywebviewyangu.cangoBack())
            mywebviewyangu.goBack()else
                super.onBackPressed()
    }
}