package com.example.fasterdelivary.db.repository

import androidx.lifecycle.LiveData
import com.example.fasterdelivary.model.OrderModel
import com.google.android.play.core.tasks.OnSuccessListener

interface OrderRepository {
     val allOrders: LiveData<List<OrderModel>>
     suspend fun insertOrder(orderModel: OrderModel, onSuccess:() -> Unit )
     suspend fun deleteOrder(orderModel: OrderModel, onSuccess:() -> Unit )

}