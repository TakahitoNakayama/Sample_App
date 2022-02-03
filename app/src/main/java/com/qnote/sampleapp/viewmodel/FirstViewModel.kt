package com.qnote.sampleapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class FirstViewModel (application: Application) : AndroidViewModel(application) {
class FirstViewModel  {


    var text : MutableLiveData<String> = MutableLiveData("first")


    fun onClickTextChange(){
        text.value = "押されました"
        Log.d("viewmodel","textchange")
    }
}