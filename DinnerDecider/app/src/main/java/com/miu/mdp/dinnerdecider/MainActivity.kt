package com.miu.mdp.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       AddBtn2.setOnClickListener {
           tv.text="Enjoy your Burger ${name.text}!"

         image.setImageResource(R.drawable.american)
           image.setImageResource(R.drawable.chinese)
           image.setImageResource(R.drawable.hamburger)
           image.setImageResource(R.drawable.pizza)
       }
    }


    fun msgOnClick(view: View) {
        tv.text="Enjoy your Burger"

    }

    fun foodOnClick(view: View) {

    }
}