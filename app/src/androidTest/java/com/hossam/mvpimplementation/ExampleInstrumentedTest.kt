/*
 * *
 *  * Created by Hossam Waziry on 04/03/2022, 17:51
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 02/03/2022, 16:52
 *
 */

package com.hossam.mvpimplementation

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.hossam.mvpimplementation", appContext.packageName)
    }
}