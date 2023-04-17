package com.example.chris_app

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SQLite_App_Chris : AppCompatActivity() {

    private lateinit var edtName:EditText
    private lateinit var edtEmail:EditText
    private lateinit var edtIdNumber:EditText
    private lateinit var btnSave:Button
    private lateinit var btnView:Button
    private lateinit var btnDelete:Button
    private lateinit var db:SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite_app_chris)

        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtIdNumber = findViewById(R.id.mEdtIdNumber)
        btnSave = findViewById(R.id.mbtnSave)
        btnView = findViewById(R.id.mbtnView)
        btnDelete = findViewById(R.id.mbtnDelete)

        //creating our database

        db = openOrCreateDatabase("ChrisDB", Context.MODE_PRIVATE,null)

        //creating our table
        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina VARCHAR, arafa VARCHAR, kitambulisho VARCHAR)")


        btnSave.setOnClickListener {
            var jina_edt = edtName.text.toString().trim()
            var arafa_edt = edtEmail.text.toString().trim()
            var kitambulisho_edt = edtIdNumber.text.toString().trim()

            //validate your edit texts
            if (jina_edt.isEmpty() || arafa_edt.isEmpty() || kitambulisho_edt.isEmpty()) {
                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()
            } else {
                db.execSQL("INSERT INTO users VALUES('\"+jina_edt\"', '\"+arafa_edt+\"', '\"+kitambulisho_edt+\"')")
                Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show()
            }

        }
    }
}