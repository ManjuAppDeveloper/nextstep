package com.manju.nextstep
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class ItemViewModel:ViewModel() {
    private val itemRespository=ItemRespository()
    private val _items=MutableLiveData<List<Item>>()
    val items:LiveData<List<Item>> get()=_items
    init{
        _items.value=itemRespository.getItems()
    }
}