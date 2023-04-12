package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Website_Activity : AppCompatActivity() {

    lateinit var myweb:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        myweb = findViewById(R.id.mWeb)
        val webSettings = myweb.settings
        webSettings.javaScriptEnabled = true
        myweb.loadUrl("https://google.com")

    }
}