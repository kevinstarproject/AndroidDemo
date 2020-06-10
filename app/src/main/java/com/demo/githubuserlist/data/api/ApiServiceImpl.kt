package com.demo.githubuserlist.data.api

import com.demo.githubuserlist.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiServiceImpl : ApiService {

    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://api.github.com/users?since=0")
            .build()
            .getObjectListSingle(User::class.java)
    }
}