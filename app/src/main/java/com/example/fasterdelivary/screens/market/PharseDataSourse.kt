package com.example.fasterdelivary.screens.market

import com.example.fasterdelivary.R
import com.example.fasterdelivary.model.Market

class PharseDataSourse {
    fun loadMarket(): List<Market>{
        return listOf(
            Market(R.string.pastaCafe,R.drawable.pasta),
            Market(R.string.bahandi,R.drawable.bahandi),
            Market(R.string.burgerKing,R.drawable.burgerking),
            Market(R.string.italianPasta,R.drawable.italianpasta),
            Market(R.string.mr_Burger, R.drawable.mr_burger),
            Market(R.string.periPeri, R.drawable.peri_peri),
            Market(R.string.salamBro, R.drawable.salam_bro),
            Market(R.string.sushiRolls, R.drawable.sushi_rolls),
            Market(R.string.sushiSyoGun, R.drawable.sushi_syo_gun),
            Market(R.string.theBestSteakHouse, R.drawable.the_best_steak_house)

            )
    }
}