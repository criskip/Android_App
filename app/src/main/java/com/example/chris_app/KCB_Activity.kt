package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KCB_Activity : AppCompatActivity() {

    private lateinit var mykcbview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)

        mykcbview = findViewById(R.id.kcbview)
        val webSettings = mykcbview.settings
        webSettings.javaScriptEnabled = true
        mykcbview.loadUrl("https://kcbbank.com")

    }
}