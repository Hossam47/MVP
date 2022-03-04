/*
 * *
 *  * Created by Hossam Waziry on 04/03/2022, 17:51
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 02/03/2022, 17:21
 *
 */

package com.hossam.mvpimplementation.ui

import com.hossam.mvpimplementation.contracts.MainContract
import com.hossam.mvpimplementation.database.Database

class MainPresenter(private val mainView: MainContract.MainView) : MainContract.MainPresenter {

    override fun login(username: String, password: String) {
            if (username==Database.getCurrentUser().username && password==Database.getCurrentUser().password){
                mainView.onSuccess("Success")
            }else mainView.onFailed("Login is Failed")
    }
}