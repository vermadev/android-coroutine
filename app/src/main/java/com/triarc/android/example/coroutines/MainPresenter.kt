package com.triarc.android.example.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
class MainPresenter(private val model: Contract.Model) : Contract.Presenter {

    private var view: Contract.View? = null

    override fun attach(view: Contract.View) {
        this.view = view
    }

    override fun getData() {
        CoroutineScope(IO).launch {
            val value = model.getData()
            withContext(Main) {
                view?.updateValue(data = value)
            }
        }
    }
}