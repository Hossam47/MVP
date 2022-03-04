/*
 * *
 *  * Created by Hossam Waziry on 04/03/2022, 17:51
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 02/03/2022, 17:13
 *
 */

package com.hossam.mvpimplementation.contracts

interface MainContract {

    interface MainView {
        fun onSuccess(message: String)
        fun onFailed(message: String)
    }

    interface MainPresenter {
        fun login(username: String, password: String)
    }
}