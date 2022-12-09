package com.example.fasterdelivary.screens.basket

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.fasterdelivary.REPOSITORY
import com.example.fasterdelivary.db.OrderDatabase
import com.example.fasterdelivary.db.repository.OrderRealization
import com.example.fasterdelivary.model.OrderModel

class BasketViewModel(application: Application): AndroidViewModel(application) {

    val context = application

    fun initDatabase(){
         val daoOrder = OrderDatabase.getInstance(context).getOrderDao()
        REPOSITORY = OrderRealization(daoOrder)
    }
    fun getAllOrders(): LiveData<List<OrderModel>>{
        return REPOSITORY.allOrders
    }
}