package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Trace
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.tabs.TabLayout.Tab

class Login : AppCompatActivity() {
private lateinit var email:EditText
private lateinit var password:EditText
private lateinit var loginBtn:Button
private lateinit var regBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.edt_email)
        password = findViewById(R.id.edt_password)
        loginBtn = findViewById(R.id.login_Btn)
        regBtn = findViewById(R.id.register_Btn)


        loginBtn.setOnClickListener {

        }
    }
}