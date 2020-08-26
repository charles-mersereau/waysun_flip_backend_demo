package com.waysuninc.flipbackendapi.api

import com.waysuninc.flipbackendapi.entities.User

interface UserApi {

    suspend fun getUser(name: String): User

}