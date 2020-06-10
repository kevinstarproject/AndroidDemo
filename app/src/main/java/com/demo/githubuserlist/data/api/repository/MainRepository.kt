package com.demo.githubuserlist.data.api.repository

import com.demo.githubuserlist.data.api.ApiHelper
import com.demo.githubuserlist.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper.ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}