package com.example.learnmvvm.viewmodel

import androidx.lifecycle.MutableLiveData


class UserLoginViewModel {

    val resultState = MutableLiveData<String>()

     fun userLogin(login: String, password: String) {
        if (login.isEmpty() || password.isEmpty()) {
            resultState.value = ("Please, fill both fields")
        } else {
            resultState.value = ("Welcome $login")
        }
    }

}

