/*
 * *
 *  * Created by Hossam Waziry on 04/03/2022, 17:51
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 02/03/2022, 17:31
 *
 */

package com.hossam.mvpimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hossam.mvpimplementation.contracts.MainContract
import com.hossam.mvpimplementation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.MainView {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()
    }

    private fun initPresenter() {
        mainPresenter = MainPresenter(this)

        binding.btnLogin.setOnClickListener {
            mainPresenter.login(
                binding.usernameEdittext.text.toString(),
                binding.passwordEdittext.text.toString()
            )
        }

    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onFailed(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}