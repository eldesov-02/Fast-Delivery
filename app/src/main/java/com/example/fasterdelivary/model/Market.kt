package com.example.fasterdelivary.model

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Market(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourseId: Int
    )
