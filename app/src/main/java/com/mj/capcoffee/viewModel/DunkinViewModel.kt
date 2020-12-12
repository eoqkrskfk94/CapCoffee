package com.mj.capcoffee.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.model.Coffee
import com.mj.capcoffee.model.FirebaseRepository
import kotlinx.coroutines.launch

class DunkinViewModel: ViewModel() {
    private val _dunkinCapsules = MutableLiveData<ArrayList<CoffeeItem>>()
    val dunkinCapsules: LiveData<ArrayList<CoffeeItem>> = _dunkinCapsules


    init {
        viewModelScope.launch{
            //_dunkinCapsules.value = FirebaseRepository.getBrandCoffee("dunkin")
        }
    }
}