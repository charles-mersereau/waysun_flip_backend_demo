package com.waysuninc.waysunflipbackenddemo.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.waysuninc.flipbackendapi.FlipRepo
import com.waysuninc.flipbackendapi.api.PokeApi
import com.waysuninc.flipbackendapi.api.UserApi
import com.waysuninc.flipbackendapi.entities.User
import com.waysuninc.kotlin_lib.HelloWorld
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    val api: UserApi = PokeApi()
    val repo: FlipRepo = FlipRepo(api)
    val helloWorld: String = HelloWorld().getHelloWorld()

    private val _user = MutableLiveData<User>().apply {
        viewModelScope.launch {
            value = repo.getUser()
        }
    }
    val user: LiveData<User> = _user
}