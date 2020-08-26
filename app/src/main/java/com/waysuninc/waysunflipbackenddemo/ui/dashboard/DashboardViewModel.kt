package com.waysuninc.waysunflipbackenddemo.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.waysuninc.flipbackendapi.FlipRepo
import com.waysuninc.flipbackendapi.api.PokeApi

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the dashboard Fragment"
    }
    val text: LiveData<String> = _text
}