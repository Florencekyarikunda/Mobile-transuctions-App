package com.example.mobilewalletapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UserViewActivity : AppCompatActivity() {
    lateinit var btnView: Button
    lateinit var tvUserName: TextView
    lateinit var tvCurrency: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view)

        btnView.setOnClickListener {
            val intent = Intent(baseContext, UserViewActivity::class.java)
            startActivity(intent)
        }
    }
}