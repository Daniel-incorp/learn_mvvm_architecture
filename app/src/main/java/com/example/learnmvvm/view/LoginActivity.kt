package com.example.learnmvvm.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.learnmvvm.R
import com.example.learnmvvm.viewmodel.UserLoginViewModel

class LoginActivity: AppCompatActivity() {

    private lateinit var welcomeMessage: TextView
    private val viewModel = UserLoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_for_user)
        initLiveData()
    }

    private fun initSignIn() {
        welcomeMessage = findViewById(R.id.welcomeTextView)
    }

    private fun initLiveData() {
        initSignIn()
        viewModel.resultState.observeForever { newState ->
            updateUI(newState)
        }
    }

    private fun updateUI(successLogin: String) {
        welcomeMessage.text
    }

}