package com.example.fasterdelivary.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fasterdelivary.db.dao.OrderDao
import com.example.fasterdelivary.model.OrderModel

@Database(entities = [OrderModel::class], version = 1)
abstract class OrderDatabase: RoomDatabase() {
    abstract fun getOrderDao(): OrderDao

    companion object{
        private var database: OrderDatabase ?= null

        @Synchronized
        fun getInstance(context: Context):OrderDatabase{
            return if(database == null){
                database = Room.databaseBuilder(context, OrderDatabase::class.java,"db").build()
                database as OrderDatabase
            }else{
                database as OrderDatabase
            }
        }
    }
}