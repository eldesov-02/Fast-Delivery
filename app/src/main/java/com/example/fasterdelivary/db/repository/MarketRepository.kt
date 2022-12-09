package com.example.fasterdelivary.db.repository

import androidx.compose.ui.input.key.Key.Companion.I
import androidx.lifecycle.MutableLiveData
import com.example.fasterdelivary.model.Market
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase

class MarketRepository {

    private val databaseReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("users")

    @Volatile private var INSTANCE : MarketRepository ?= null

    fun getInstance() : MarketRepository{
        return INSTANCE ?: synchronized(this){

            val instance = MarketRepository()
            INSTANCE = instance
            instance
        }

    }



    fun  loadUsers(marketList : MutableLiveData<List<Market>>){

        databaseReference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _marketList: List<Market> = snapshot.children.map { dataSnapshot ->
                        dataSnapshot.getValue(Market::class.java)!!
                    }

                    marketList.postValue(_marketList)

                }catch (e : Exception){

                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }

}

