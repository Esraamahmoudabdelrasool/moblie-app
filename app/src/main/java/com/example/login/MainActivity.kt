package com.example.login

import android.content.Intent
import android.os.Build

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sign


class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signup.setOnClickListener{
            signup.background=resources.getDrawable(R.drawable.switch_trucs,null)
            signup.setTextColor(resources.getColor(R.color.pinkColor,null))
            login.background=null
            singupLayout.visibility=View.VISIBLE
            logInLayout.visibility=View.GONE
            login.setTextColor(resources.getColor(R.color.textcolor,null))

        }
        login.setOnClickListener{
            signup.background=null
            signup.setTextColor(resources.getColor(R.color.textcolor,null))
            login.background=resources.getDrawable(R.drawable.switch_trucs,null)
            singupLayout.visibility=View.GONE
            logInLayout.visibility=View.VISIBLE
            login.setTextColor(resources.getColor(R.color.pinkColor,null))

        }



    }
}