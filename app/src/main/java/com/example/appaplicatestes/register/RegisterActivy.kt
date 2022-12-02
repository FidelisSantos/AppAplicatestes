package com.example.appaplicatestes.register

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.appaplicatestes.MainActivity
import com.example.appaplicatestes.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.util.regex.Pattern

class RegisterActivy : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activy)

        firebaseAuth = FirebaseAuth.getInstance()
        val btn_register = findViewById<Button>(R.id.btn_register);
        val btn_visible_password = findViewById<ImageButton>(R.id.password_visible)

        btn_visible_password.setOnClickListener{
            val isVisible = findViewById<EditText>(R.id.password_register)
            if(isVisible.inputType != InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD){
                 isVisible.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            }else{
                isVisible.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }

        btn_register.setOnClickListener{
            val name = findViewById<EditText>(R.id.name).text.toString()
            val rgm = findViewById<EditText>(R.id.rgm).text.toString()
            val cursor = findViewById<EditText>(R.id.cursor).text.toString()

            val email = findViewById<EditText>(R.id.email_register).text.toString()
            val password = findViewById<EditText>(R.id.password_register).text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                if(isEmail(email)) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, MainActivity::class.java)
                                 saveInFirestore(name,rgm,cursor , email)
                                    startActivity(intent)
                            } else {
                                Log.w(ContentValues.TAG, "Erro ao criar usuário", it.exception)
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }
                }else{
                    Toast.makeText(this, "Email inválido",Toast.LENGTH_SHORT)
                }
            }else{
                Toast.makeText(this, "Campos email ou senha vazio", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun  isEmail(email:String) : Boolean{
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }

    fun saveInFirestore(name: String,rgm: Any, cursor:String, email: String){
        val firestore = FirebaseFirestore.getInstance()
        val user: MutableMap<String, Any> = HashMap()
        user["name"] = name;
        user["rgm"] = rgm;
        user["cursor"] = cursor;
        user["email"] = email;

        firestore.collection("Users")
            .add(user)
            .addOnSuccessListener {
                Toast.makeText(this, "Dados adicionados", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {
                Toast.makeText(this, "Erro a cadastrar os dados", Toast.LENGTH_SHORT).show()
            }

    }


    val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
}