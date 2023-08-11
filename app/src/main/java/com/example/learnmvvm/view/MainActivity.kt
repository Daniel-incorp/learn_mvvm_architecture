package com.example.learnmvvm.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.learnmvvm.R
import com.example.learnmvvm.viewmodel.UserLoginViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var userLogin: EditText
    private lateinit var userPassword: EditText
    private lateinit var btnSingIn: Button
    private lateinit var btnSingUp: Button
    private val viewModel = UserLoginViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {

        userLogin = findViewById(R.id.loginView)
        userPassword = findViewById(R.id.passwordView)
        btnSingIn = findViewById(R.id.btnSignIn)
        btnSingUp = findViewById(R.id.btnSignUp)

        btnSingIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            viewModel.userLogin(
                userLogin.text.toString(),
                userPassword.text.toString()
            )
            startActivity(intent)
        }

        btnSingUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}

