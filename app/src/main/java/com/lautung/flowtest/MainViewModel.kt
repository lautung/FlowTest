package com.lautung.flowtest

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.flow

class MainViewModel:ViewModel() {

    val timeflow = flow {
        var time = 0 ;
        while (true){
            emit(time)
            kotlinx.coroutines.delay(1000)
            time++
        }
    }
}