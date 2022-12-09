package com.example.fasterdelivary.screens.detail

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fasterdelivary.REPOSITORY
import com.example.fasterdelivary.model.OrderModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel: ViewModel() {
    fun delete(orderModel: OrderModel, onSuccess:() -> Unit) =
        viewModelScope.launch ( Dispatchers.IO ){
            REPOSITORY.deleteOrder(orderModel){
                onSuccess()
            }
        }
}