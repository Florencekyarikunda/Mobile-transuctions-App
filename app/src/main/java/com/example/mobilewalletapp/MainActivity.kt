package com.example.mobilewalletapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var tvDescription:TextView
    lateinit var tvDate:TextView
    lateinit var tvReference:TextView
    lateinit var btnClick:Button
    lateinit var tvAmount:TextView
    lateinit var tvTransuctionType:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvDescription=findViewById<TextView>(R.id.tvDescription)
        var tvDate=findViewById<TextView>(R.id.tvDate)
        var tvAmount=findViewById<TextView>(R.id.tvAmount)
        var tvReference=findViewById<TextView>(R.id.tvReference)
        var tvTransuctionType=findViewById<TextView>(R.id.tvTransactionType)
        var btnClick=findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            var intent=Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}