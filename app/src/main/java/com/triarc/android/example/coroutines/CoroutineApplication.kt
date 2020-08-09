package com.triarc.android.example.coroutines

import android.app.Application

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
class CoroutineApplication: Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
            .builder()
            .module(Module())
            .build()
    }

    fun getApplicationComponent() = applicationComponent
}
