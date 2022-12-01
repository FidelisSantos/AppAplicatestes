package com.example.appaplicatestes

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appaplicatestes.options.OptionsActivity
import com.example.appaplicatestes.register.RegisterActivy
import com.google.firebase.auth.FirebaseAuth
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firebaseAuth = FirebaseAuth.getInstance()

        val btn_login = findViewById<Button>(R.id.btn_login);
        val btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar);
        val btn_visible_password = findViewById<ImageButton>(R.id.password_visible)

        val currentUser = firebaseAuth.currentUser
        if(currentUser == null){
            Toast.makeText(this, "Usuário vazio", Toast.LENGTH_SHORT).show()
        }

        btn_visible_password.setOnClickListener{
            val isVisible = findViewById<EditText>(R.id.editTextPassword)
            if(isVisible.inputType != InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD){
                isVisible.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            }else{
                isVisible.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }

        btn_login.setOnClickListener{
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString().trim()
            val password = findViewById<EditText>(R.id.editTextPassword).text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                    firebaseAuth?.signInWithEmailAndPassword(email, password)?.addOnCompleteListener{
                        if(it.isSuccessful) {
                            val intent = Intent(this, OptionsActivity::class.java)
                            startActivity(intent)
                        }
                        else{
                            Log.w(TAG, "Erro ao criar usuário", it.exception)
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
            }else{
                Toast.makeText(this, "Campo email ou senha vazio", Toast.LENGTH_SHORT).show()
            }
        }
        btn_cadastrar.setOnClickListener{
            val cadastrar = Intent(this, RegisterActivy::class.java)
            startActivity(cadastrar)
        }
    }


}