package com.example.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginPage : AppCompatActivity() {

    private lateinit var etusername: EditText
    private lateinit var etpassword: EditText
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        etusername = findViewById(R.id.usernamelogin)
        etpassword = findViewById(R.id.passwordlogin)
        btnlogin = findViewById(R.id.btnLogin)

        btnlogin.setOnClickListener() {
            if (etusername.text.toString().isEmpty()) {
                etusername.error = "Please enter username"
                etusername.requestFocus()
            }

            if (etpassword.text.toString().isEmpty()) {
                etpassword.error = "Please enter password"
                etpassword.requestFocus()
            }

            if (etusername.text.toString() == "sujit" && etpassword.text.toString() == "sujit12345") {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Incorrect credentials. Please retry.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}