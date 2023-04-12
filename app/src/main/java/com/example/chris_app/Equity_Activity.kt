package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Equity_Activity : AppCompatActivity() {

    private lateinit var myequityview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)

        myequityview = findViewById(R.id.equityview)
        val webSettings = myequityview.settings
        webSettings.javaScriptEnabled = true
        myequityview.loadUrl("https://equitybank.com")

    }
}