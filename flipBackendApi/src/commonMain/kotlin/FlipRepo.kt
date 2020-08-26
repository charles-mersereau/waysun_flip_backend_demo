package com.waysuninc.flipbackendapi

import com.waysuninc.flipbackendapi.api.UserApi
import com.waysuninc.flipbackendapi.entities.User

class FlipRepo(val api: UserApi) {

    suspend fun getUser(): User {
        return api.getUser("pikachu")
    }

}