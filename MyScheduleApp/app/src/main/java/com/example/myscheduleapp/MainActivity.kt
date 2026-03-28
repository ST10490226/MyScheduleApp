package com.example.myscheduleapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

val txtView = findViewById<TextView>(R.id.txtView)
val edtTxtTime = findViewById<EditText>(R.id.edtTxtTime)
val btnGenerate = findViewById<Button>(R.id.btnGenerate)
val btnClear = findViewById<Button>(R.id.btnClear)

btnGenerate.setOnClickListener {
 val time = edtTxtTime.text.toString()
   if (time == "Morning") {
       txtView.text = "call a family member to say good morning and wish them a good day."

   } else if (time == "Noon") {

       txtView.text = "invite a coworker to lunch."

   } else if (time == "Afternoon") {

       txtView.text = "compliment your boss on a good job he is doing."

   } else if (time == "Evening") {

       txtView.text = "wave a coworker goodbye."

   } else if (time == "Night"){

       txtView.text = "have a nice conversation with a friend."

   } else if (time == "Late Night"){

       txtView.text = "text a family member goodnight."


   } else {
       txtView.text = "Please enter the correct time."
   }

}
        
        btnClear.setOnClickListener {
            edtTxtTime.text.clear()
            txtView.text = ""
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}