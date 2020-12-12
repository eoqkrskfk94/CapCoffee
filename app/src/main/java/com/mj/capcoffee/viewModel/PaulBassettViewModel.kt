package com.mj.capcoffee.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mj.capcoffee.datas.CoffeeItem
import com.mj.capcoffee.model.Coffee
import com.mj.capcoffee.model.FirebaseRepository
import kotlinx.coroutines.launch

class PaulBassettViewModel : ViewModel(){
    private val _paulBassettCapsules = MutableLiveData<ArrayList<CoffeeItem>>()
    val paulBassettCapsules: LiveData<ArrayList<CoffeeItem>> = _paulBassettCapsules


    init {
        viewModelScope.launch{
            //_paulBassettCapsules.value = FirebaseRepository.getBrandCoffee("paul_bassett")
        }
    }
}