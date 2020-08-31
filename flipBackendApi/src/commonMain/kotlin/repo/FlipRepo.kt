package com.waysuninc.flipbackendapi.repo

import com.waysuninc.flipbackendapi.api.PokeApi
import com.waysuninc.flipbackendapi.api.UserApi
import com.waysuninc.flipbackendapi.entities.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FlipRepo(private val api: UserApi = PokeApi()) {

    fun getUser(username: String, callback: (User) -> Unit) {
        GlobalScope.launch {
            val user = api.getUser(username)
            callback(user)
        }
    }

}