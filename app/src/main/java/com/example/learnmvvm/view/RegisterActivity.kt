package com.example.learnmvvm.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.learnmvvm.R
import com.example.learnmvvm.viewmodel.UserLoginViewModel

class RegisterActivity: AppCompatActivity() {

    private lateinit var loginRegisterTextEdit: EditText
    private lateinit var passwordRegisterTextEdit: EditText
    private lateinit var btnRegister: Button
    private lateinit var btnBack2Login: Button
    private val viewModel = UserLoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        initUI()
    }

    private fun initUI() {

        loginRegisterTextEdit = findViewById(R.id.loginRegisterEditText)
        passwordRegisterTextEdit = findViewById(R.id.passwordRegisterEditText)
        btnRegister = findViewById(R.id.btnRegister)
        btnBack2Login = findViewById(R.id.btnBack2Login)

        btnRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            viewModel.userLogin(
                loginRegisterTextEdit.text.toString(),
                passwordRegisterTextEdit.text.toString()
            )
            startActivity(intent)
        }

        btnBack2Login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

}