package com.example.chris_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Simple_CalculatorApp_Chris : AppCompatActivity() {

    private lateinit var txt_answer_display: TextView
    private lateinit var edtFirst: EditText
    private lateinit var edtSecond: EditText
    private lateinit var button_add: Button
    private lateinit var button_multiply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculator_app_chris)

        //instantiate your variables

        txt_answer_display = findViewById(R.id.txtdisplay)
        edtFirst = findViewById(R.id.edtfirstnumber)
        edtSecond = findViewById(R.id.edtsecondnumber)
        button_add = findViewById(R.id.btnadd)
        button_multiply = findViewById(R.id.btnmultiply)

        button_multiply.setOnClickListener {
            var num_one = edtFirst.text.toString().trim()
            var num_two = edtSecond.text.toString().trim()

            if (num_one.isEmpty() || num_two.isEmpty()){

                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()

            } else{
                var result_two = num_one.toDouble() * num_two.toDouble()
                txt_answer_display.text = result_two.toString()
            }

        }

        button_add.setOnClickListener {

            var firsr_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //validation of edit text

            if (firsr_num.isEmpty()  ||   second_num.isEmpty()) {

                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()

            } else{

                //means has some data
                var result = firsr_num.toDouble() + second_num.toDouble()
                txt_answer_display.text = result.toString()
            }

        }

    }
}