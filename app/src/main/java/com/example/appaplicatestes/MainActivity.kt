package com.example.appaplicatestes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appaplicatestes.register.RegisterActivy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login = findViewById<Button>(R.id.btn_login);
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar);

        btn_login.setOnClickListener{
            val cadastrar = Intent(this, RegisterActivy::class.java)
            startActivity(cadastrar)
        }
        btn_cadastrar.setOnClickListener{
            val cadastrar = Intent(this, RegisterActivy::class.java)
            startActivity(cadastrar)
        }
    }
}