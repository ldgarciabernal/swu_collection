package com.example.swu_collection.data.providers

import com.example.swu_collection.domain.model.SetInfo
import com.example.swu_collection.domain.model.SetInfo.Shd
import com.example.swu_collection.domain.model.SetInfo.Sor
import com.example.swu_collection.domain.model.SetInfo.Totr
import javax.inject.Inject

class SetProvider @Inject constructor() {

    fun getSets(): List<SetInfo> {
        return listOf(
            Sor, Shd, Totr
        )
    }
}