package com.example.grinjow234

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val gy=findViewById<Button>(R.id.loginButton)
        val gh=findViewById<EditText>(R.id.usernameEditText)
      gy.setOnClickListener()
      {
          if(gh.text.isEmpty()){
              Toast.makeText(this,"please enter your name",Toast.LENGTH_LONG).show()
          }
          else
          {
              val intent= Intent(this,MainActivity3::class.java)
              startActivity(intent)
          }
      }
    }
}