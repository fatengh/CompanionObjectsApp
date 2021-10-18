package com.example.companionobjectsapp

import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Background {
    companion object changeBackground {
        //step 3: write your variable or/and function inside the companion object
        fun change(cl: ConstraintLayout, theme:String, tv: TextView, input: EditText, btnChange: Button){
            when{
                theme.uppercase()== "DAY" ->  {
                    cl.setBackgroundResource(R.drawable.day)
                    tv.setTextColor(Color.BLACK)
                    input.setTextColor(Color.BLACK)
                    input.setHintTextColor(Color.GRAY)
                    btnChange.setTextColor(Color.BLACK)
                    input.text.clear()
                }
                theme.uppercase() == "NIGHT"  -> {
                    cl.setBackgroundResource(R.drawable.night)
                    tv.setTextColor(Color.WHITE)
                    input.setTextColor(Color.WHITE)
                    input.setHintTextColor(Color.WHITE)
                    btnChange.setTextColor(Color.WHITE)
                    input.text.clear()
                }
            }
        }

    }
}