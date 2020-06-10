package com.demo.githubuserlist.data.api


import com.demo.githubuserlist.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}