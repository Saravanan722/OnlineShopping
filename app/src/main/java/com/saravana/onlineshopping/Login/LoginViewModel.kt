package com.saravana.onlineshopping.Login

import android.app.Application
import android.database.Observable
import androidx.databinding.Bindable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.saravana.onlineshopping.RoomDatabase.RegisterRepository

class LoginViewModel(repository: RegisterRepository, application: Application) :
    AndroidViewModel(application)//Observable
    {
    val users = repository.users

    @Bindable
    val inputUsername = MutableLiveData<String>()

    @Bindable
    val inputPassword = MutableLiveData<String>()

    //Function triggered When the Login Button is Clicked, Via Binding.
    fun loginButton() {
        //-------Logic for the code
    }

    fun signUP() {
        //navigate to the Register Fragment
    }



//    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//    }
//
//    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//    }
}