package com.example.fasterdelivary.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Index
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fasterdelivary.model.OrderModel

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(orderModel: OrderModel)

    @Delete
    suspend fun delete(orderModel: OrderModel)

    @Query("SELECT * from order_table")
    fun getAllNotes(): LiveData<List<OrderModel>>
}