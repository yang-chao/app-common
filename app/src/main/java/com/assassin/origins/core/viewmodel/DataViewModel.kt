package com.assassin.origins.core.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

abstract class DataViewModel<T>(application: Application) : AndroidViewModel(application) {

    protected var data: MutableLiveData<T> = MutableLiveData()

    fun getData(): LiveData<T> {
        return data
    }

    abstract fun loadData()
}