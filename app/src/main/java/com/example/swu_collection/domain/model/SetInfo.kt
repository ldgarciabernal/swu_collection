package com.example.swu_collection.domain.model

import com.example.swu_collection.R


sealed class SetInfo(
    val alias: Int,
    val name: Int,
    val logo: Int,
    val release: Int,
    val cardNumber: Int?
) {
    data object Sor : SetInfo(
        R.string.set_sor_alias,
        R.string.set_sor_name,
        R.drawable.swu_sor_logo,
        R.string.set_sor_release,
        252
    )

    data object Shd : SetInfo(
        R.string.set_shd_alias,
        R.string.set_shd_name,
        R.drawable.swu_shd_logo,
        R.string.set_shd_release,
        262
    )

    data object Totr : SetInfo(
        R.string.set_totr_alias,
        R.string.set_totr_name,
        R.drawable.swu_totr_logo,
        R.string.set_totr_release,
        null
    )
}