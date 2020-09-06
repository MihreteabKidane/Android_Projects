package com.miu.mdp.walmart_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageView
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {
    lateinit var result: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        imageView1.setOnClickListener {
            Toast.makeText(this, "You have chosen the Clothing category of shopping",Toast.LENGTH_LONG).show()
        }
        imageView2.setOnClickListener {
            Toast.makeText(this, "You have chosen the Electronic category of shopping ", Toast.LENGTH_LONG).show()
        }
        imageView3.setOnClickListener {
            Toast.makeText(this, "You have chosen the Beauty category of shopping",Toast.LENGTH_LONG).show()
        }
        imageView4.setOnClickListener {
            Toast.makeText(this, "You have chosen the Food category of shopping",Toast.LENGTH_LONG).show()
        }
        var intt = intent
        var user = intt.getSerializableExtra("user")
        result = user as User
        txtUser.text = "Welcome "+result.userName

    }

}