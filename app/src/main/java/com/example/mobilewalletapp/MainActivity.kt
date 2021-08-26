package com.example.mobilewalletapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var tvDescription:TextView
    lateinit var tvDate:TextView
    lateinit var tvReference:TextView
    lateinit var btnClick:Button
    lateinit var tvAmount:TextView
    lateinit var tvTransactionType:TextView
    lateinit var rvTransucts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         tvDescription=findViewById<TextView>(R.id.tvDescription)
         tvDate=findViewById<TextView>(R.id.tvDate)
         tvAmount=findViewById<TextView>(R.id.tvAmount)
         tvReference=findViewById<TextView>(R.id.tvReference)
         tvTransactionType=findViewById<TextView>(R.id.tvTransactionType)
         btnClick=findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            var intent=Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}