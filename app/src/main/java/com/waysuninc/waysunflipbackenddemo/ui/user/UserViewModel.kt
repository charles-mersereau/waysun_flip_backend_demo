package com.waysuninc.waysunflipbackenddemo.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.waysuninc.flipbackendapi.FlipRepo
import com.waysuninc.flipbackendapi.api.PokeApi
import com.waysuninc.flipbackendapi.entities.User
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    val api = PokeApi()
    val repo = FlipRepo(api)

    private val _user = MutableLiveData<User>().apply {
        viewModelScope.launch {
            value = repo.getUser()
        }
    }
    val user: LiveData<User> = _user
}