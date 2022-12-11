package com.example.fasterdelivary.screens.pharmacy

import com.example.fasterdelivary.R

class PhraseAndPhotoDataSourse {
    fun loadPharmacy(): List<Pharmacy>{
        return listOf(
            Pharmacy(R.string.tabletki, R.drawable.img_1),
            Pharmacy(R.string.сиропы, R.drawable.siropi),
            Pharmacy(R.string.postilki, R.drawable.postilki),
            Pharmacy(R.string.preporati, R.drawable.preporati),
            Pharmacy(R.string.spirti, R.drawable.spirti),
            Pharmacy(R.string.Binti, R.drawable.binti),
            Pharmacy(R.string.Spreii, R.drawable.sprei),

        )
    }
}