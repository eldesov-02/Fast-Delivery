package com.example.fasterdelivary.db

import androidx.room.Database
import com.example.fasterdelivary.model.OrderModel

@Database(entities = [OrderModel::class], version = 1)
abstract class OrderDatabase {

}