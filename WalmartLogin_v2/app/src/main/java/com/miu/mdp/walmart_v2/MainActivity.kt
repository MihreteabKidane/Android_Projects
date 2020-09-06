package com.miu.mdp.walmart_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val data = ArrayList<User>()
    val user1 = User("Mihreteab", " Kidane", "kidane.mb@gmail.com","123")
    var user2=User("Simon","Tsegai","simon@gmail.com","1234")
    var user3=User("John","Bob","john@gmail.com","12345")
    var user4=User("Selam","Kidane","selam@gmail.com","123456")
    var user5=User("Nahom","Dani","nahom@gmail.com","1234567")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data.add(user1)
        data.add(user2)
        data.add(user3)
        data.add(user4)
        data.add(user5)
        var newIntent=intent
        var newIntt = newIntent.getSerializableExtra("newAccount")
        if (newIntt!=null){
            var newUser = newIntt as User
            data.add(newUser)
            Toast.makeText(this,"New account created successfully", Toast.LENGTH_LONG).show()

        }
    }
     fun login(view: View){
         var userName=edit_Email.text.toString()
         var password = edit_Password.text.toString()
         var flag = false
         for(i in data){
             if(userName.equals(i.userName) && password.equals(i.password)){
                 var user = User(i.firstName,i.lastName,i.userName,i.password)
                 var intent = Intent(this,ShoppingActivity::class.java )
                 intent.putExtra("user", user)
                 startActivity(intent)
                 flag=true
             }
         }
         if(!flag){
             Toast.makeText(this,"User name or Password doesn't match", Toast.LENGTH_LONG).show()
         }

     }
    fun newAccount(view: View){
        var intent = Intent (this,CreateAccount::class.java)
        startActivity(intent)

    }
    fun forgotPassword(view: View){
        var uName = edit_Email.text.toString()
        var flag = false
        if(uName!=null || uName!=""){
            for(i in data){
                if(i.userName==uName){
                    var intt = Intent()
                    intt.action = Intent.ACTION_SEND
                    intt.type="txt/plain"
                    intt.putExtra(Intent.EXTRA_TEXT, i.password)
                    startActivity(intt)
                    flag=true
                }
            }
            if(!flag){
                Toast.makeText(this,"Please put your user name", Toast.LENGTH_LONG).show()
            }
        }
    }
}