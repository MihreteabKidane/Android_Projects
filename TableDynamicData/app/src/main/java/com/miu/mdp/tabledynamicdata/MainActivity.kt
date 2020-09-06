package com.miu.mdp.tabledynamicdata

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add_button.setOnClickListener {
            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParams.setMargins(1,15,1,15)
            tableRow.layoutParams=layoutParams
            if(android_version.text.isNotEmpty() and android_codeName.text.isNotEmpty()){

                val textView1 = TextView(this)
                textView1.setBackgroundColor(Color.parseColor("#FFC107"))
                textView1.text = android_version.text

                val textView2 = TextView(this)
                val space = Space(this)
                textView2.setBackgroundColor(Color.parseColor("#FFC107"))
                textView2.text = android_codeName.text

                textView1.layoutParams=layoutParams
                textView2.layoutParams=layoutParams

                tableRow.addView(textView1,0)
                tableRow.addView(textView2,1)
                layout_main.addView(tableRow,layoutParams)
                layout_main.addView(space)

            }
        }
    }
}


