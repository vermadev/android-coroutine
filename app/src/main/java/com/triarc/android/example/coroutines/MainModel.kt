package com.triarc.android.example.coroutines

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
class MainModel : Contract.Model {

    override suspend fun getData(): String = "Test Data"
}
