package com.example.learnmvvm.model

import androidx.lifecycle.MutableLiveData


class MainModel() {

    fun resultState(): MutableLiveData<String> {
        return MutableLiveData()
    }

}