package com.example.swu_collection.ui.set

import androidx.lifecycle.ViewModel
import com.example.swu_collection.data.providers.SetProvider
import com.example.swu_collection.domain.model.SetInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SetViewModel @Inject constructor(setProvider: SetProvider) : ViewModel() {

    private var _swuSet = MutableStateFlow<List<SetInfo>>(emptyList())
    val swuSet: StateFlow<List<SetInfo>> = _swuSet

    init {
        _swuSet.value = setProvider.getSets()
    }
}