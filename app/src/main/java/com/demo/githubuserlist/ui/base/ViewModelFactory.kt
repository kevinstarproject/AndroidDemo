package com.demo.githubuserlist.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.demo.githubuserlist.data.api.ApiHelper
import com.demo.githubuserlist.data.api.repository.MainRepository
import com.demo.githubuserlist.ui.main.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper.ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}