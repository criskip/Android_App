package com.example.chris_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intents_Android_Chris : AppCompatActivity() {

    private lateinit var btnSms:Button
    private lateinit var btnEmail:Button
    private lateinit var btnCamera:Button
    private lateinit var btnShare:Button
    private lateinit var btnMpesa:Button
    private lateinit var btnCall:Button
    private lateinit var btnWebsite:Button
    private lateinit var btnMap:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents_android_chris)

        btnSms = findViewById(R.id.mbtnSms)
        btnEmail = findViewById(R.id.mbtnEmail)
        btnCamera = findViewById(R.id.mbtnCamera)
        btnShare = findViewById(R.id.mbtnShare)
        btnMpesa = findViewById(R.id.mbtnMpesa)
        btnCall = findViewById(R.id.mbtnCall)
        btnWebsite = findViewById(R.id.mbtnWebsite)
        btnMap = findViewById(R.id.mbtnMap)


        btnSms.setOnClickListener {
            val uri: Uri= Uri.parse("smsto:0724907784")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "vipi wazito")
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","chriskipkemboi3@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sire, I am applying for a marketing job at your company")
            startActivity(Intent.createChooser(emailIntent, "send email...."))

        }

        btnMpesa.setOnClickListener {
            val simToolkitIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitIntent?.let { startActivity(it) }
        }

    }
}