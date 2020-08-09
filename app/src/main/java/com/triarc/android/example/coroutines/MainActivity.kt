package com.triarc.android.example.coroutines

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

/**
 * Created by Devanshu Verma on 09 Aug, 2020
 */
class MainActivity: AppCompatActivity(), Contract.View {

    @Inject
    lateinit var presenter: Contract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as? CoroutineApplication)?.getApplicationComponent()?.inject(target = this)

        presenter.attach(view = this)

        presenter.getData()
    }

    override fun updateValue(data: String?) {
        Toast.makeText(applicationContext, data, Toast.LENGTH_SHORT).show()
    }
}
