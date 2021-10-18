package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var edInput: EditText
    lateinit var btnChange: Button
    lateinit var userThem:String
    lateinit var clBG: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.textView)
        edInput=findViewById(R.id.edInput)
        btnChange=findViewById(R.id.btnChange)
        clBG=findViewById(R.id.clBG)

        tv.text=constValues.tvString

        btnChange.setOnClickListener(){
            userThem=edInput.text.toString()
            if(userThem.isNotEmpty()){
                Background.change(clBG,userThem,tv,edInput, btnChange)
            }
        }

    }
}