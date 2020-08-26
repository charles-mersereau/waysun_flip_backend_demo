package com.waysuninc.waysunflipbackenddemo.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.waysuninc.waysunflipbackenddemo.R

class UserFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        userViewModel =
                ViewModelProviders.of(this).get(UserViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_user, container, false)

        val tvName: TextView = root.findViewById(R.id.name)
        val tvOrder: TextView = root.findViewById(R.id.order)

        userViewModel.user.observe(viewLifecycleOwner, Observer { user ->
            tvName.text = user.name
            tvOrder.text = user.order.toString()
        })

        return root
    }
}