package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Toasting_android_Chris : AppCompatActivity() {

    private lateinit var displayinfo:TextView
    private lateinit var user_edt:EditText
    private lateinit var btn_sub:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toasting_android_chris)

        displayinfo = findViewById(R.id.txtDisplay)
        user_edt = findViewById(R.id.edtuserdata)
        btn_sub = findViewById(R.id.btnsubmit)

        //listen for events

        btn_sub.setOnClickListener {
            var userinput = user_edt.text.toString().trim()
            Toast.makeText(this, userinput, Toast.LENGTH_SHORT).show()
            displayinfo.text = userinput.toString()

            //Toast.makeText(this, "I voted for Wajakoyah", Toast.LENGTH_SHORT).show()
        }
    }
}