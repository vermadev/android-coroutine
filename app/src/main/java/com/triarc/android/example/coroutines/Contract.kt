package com.triarc.android.example.coroutines

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
interface Contract {
    interface View {
        fun updateValue(data: String?)
    }

    interface Model {
        suspend fun getData(): String
    }

    interface Presenter {
        fun attach(view: View)
        fun getData()
    }
}