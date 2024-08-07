package com.manju.nextstep
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class ItemViewModel:ViewModel() {
    private val itemRespository=ItemRespository()
    private val itemsMuted=MutableLiveData<List<Item>>()
    val itemsLive:LiveData<List<Item>> get()=itemsMuted
    init{
        itemsMuted.value=itemRespository.getItems()
    }
}