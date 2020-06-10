package com.demo.githubuserlist.data.api

class ApiHelper {
    class ApiHelper(private val apiService: ApiService) {

        fun getUsers() = apiService.getUsers()

    }
}