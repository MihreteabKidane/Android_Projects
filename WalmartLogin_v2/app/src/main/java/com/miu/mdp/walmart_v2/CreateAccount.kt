package com.miu.mdp.walmart_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_acount.*

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acount)
    }
    fun createAccount(view: View){
        var fName =txtFirstName.text.toString()
        var lName = txtLastName.text.toString()
        var email = txtEmail.text.toString()
        var passw = txtPassword.text.toString()

        var flag = false
        if(fName!="" && lName!="" && email!="" && passw != ""){
            var newAccount = User(fName,lName,email,passw)
            var intt = Intent(this,MainActivity::class.java)
            intt.putExtra("newAccount",newAccount)
            startActivity(intt)
            flag=true
        }
        if(!flag){
            Toast.makeText(this,"Please fill all fields correctly", Toast.LENGTH_LONG).show()
        }
    }
}