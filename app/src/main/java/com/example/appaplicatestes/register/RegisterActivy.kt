package com.example.appaplicatestes.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appaplicatestes.MainActivity
import com.example.appaplicatestes.R

class RegisterActivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activy)

        val btn_register = findViewById<Button>(R.id.btn_register);

        btn_register.setOnClickListener{
            val register = Intent(this, MainActivity::class.java)
            startActivity(register)
        }
    }
}