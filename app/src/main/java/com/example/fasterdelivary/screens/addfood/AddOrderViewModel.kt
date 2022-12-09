package com.example.fasterdelivary.screens.addfood

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fasterdelivary.REPOSITORY
import com.example.fasterdelivary.model.OrderModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddOrderViewModel: ViewModel() {

    fun insert(orderModel: OrderModel,onSuccess:() -> Unit) =
        viewModelScope.launch ( Dispatchers.IO ){
            REPOSITORY.insertOrder(orderModel){
                onSuccess()
            }
        }
}