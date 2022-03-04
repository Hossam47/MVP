/*
 * *
 *  * Created by Hossam Waziry on 04/03/2022, 17:51
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 02/03/2022, 17:06
 *
 */


package com.hossam.mvpimplementation.database

import com.hossam.mvpimplementation.data.User

object Database {

    fun getCurrentUser(): User {
        return User("Hossam","12345")
    }
}