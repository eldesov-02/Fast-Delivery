package com.example.fasterdelivary.screens.market

import com.example.fasterdelivary.R
import com.example.fasterdelivary.screens.pharmacy.Pharmacy

class TitleAndPhotoDataSource {
    fun loadMarket(): List<Market>{
        return listOf(
            Market(R.string.juice, R.drawable.juice),
            Market(R.string.chokolates, R.drawable.chocolates),
            Market(R.string.chipsi, R.drawable.chipsi),
            Market(R.string.cakes, R.drawable.cakes),
            Market(R.string.fruits, R.drawable.fruits),
            Market(R.string.vegetables, R.drawable.vegetables),
            Market(R.string.salats, R.drawable.salats),
            Market(R.string.sigaretes, R.drawable.sigaretes),
            Market(R.string.ketchupes, R.drawable.ketchupes),

            )
    }
}