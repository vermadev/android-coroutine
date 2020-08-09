package com.triarc.android.example.coroutines

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
@Singleton
@Component(modules = [Module::class])
interface ApplicationComponent {
    fun inject(target: MainActivity)
}
