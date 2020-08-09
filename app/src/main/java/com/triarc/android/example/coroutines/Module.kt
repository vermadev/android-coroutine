package com.triarc.android.example.coroutines

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
@Module
class Module {

    @Provides
    @Singleton
    fun providePresenter(model: Contract.Model): Contract.Presenter = MainPresenter(model)

    @Provides
    @Singleton
    fun provideModel(): Contract.Model = MainModel()
}
