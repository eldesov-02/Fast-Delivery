package com.example.fasterdelivary.screens.food1

import com.example.fasterdelivary.R

class PharseDataSourse {
    fun loadMarket(): List<Food>{
        return listOf(
            Food(R.string.pastaCafe,R.drawable.pasta),
            Food(R.string.bahandi,R.drawable.bahandi),
            Food(R.string.burgerKing,R.drawable.burgerking),
            Food(R.string.italianPasta,R.drawable.italianpasta),
            Food(R.string.mr_Burger, R.drawable.mr_burger),
            Food(R.string.periPeri, R.drawable.peri_peri),
            Food(R.string.salamBro, R.drawable.salam_bro),
            Food(R.string.sushiRolls, R.drawable.sushi_rolls),
            Food(R.string.sushiSyoGun, R.drawable.sushi_syo_gun),
            Food(R.string.theBestSteakHouse, R.drawable.the_best_steak_house)

            )
    }
}