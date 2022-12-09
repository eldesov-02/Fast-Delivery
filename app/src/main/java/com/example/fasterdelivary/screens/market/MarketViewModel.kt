package com.example.fasterdelivary.screens.market

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fasterdelivary.db.repository.FoodRepository
import com.example.fasterdelivary.db.repository.MarketRepository
import com.example.fasterdelivary.maski.adapter.UserAdapter
import com.example.fasterdelivary.model.Market

class MarketViewModel : ViewModel() {

    private val repository : MarketRepository
    private val _allProducts = MutableLiveData<List<Market>>()
    val allProducts : LiveData<List<Market>> = _allProducts

    init {

        repository = MarketRepository().getInstance()
        repository.loadUsers(_allProducts)

    }


}