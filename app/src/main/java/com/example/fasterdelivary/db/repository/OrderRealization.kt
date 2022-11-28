package com.example.fasterdelivary.db.repository

import androidx.lifecycle.LiveData
import com.example.fasterdelivary.db.dao.OrderDao
import com.example.fasterdelivary.model.OrderModel

class OrderRealization(private val orderDao: OrderDao): OrderRepository {

    override val allOrders: LiveData<List<OrderModel>>
        get() = orderDao.getAllNotes()

    override suspend fun insertOrder(orderModel: OrderModel, onSuccess: () -> Unit) {
        orderDao.insert(orderModel)
        onSuccess
    }

    override suspend fun deleteOrder(orderModel: OrderModel, onSuccess: () -> Unit) {
        orderDao.delete(orderModel)
        onSuccess
    }
}