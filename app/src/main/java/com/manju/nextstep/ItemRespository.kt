package com.manju.nextstep

class ItemRespository {
    fun getItems(): List<Item>{
        return listOf(
            Item(1,"Pannapalli"),
            Item(2,"Mudugurikai"),
            Item(3,"Narasapuram"),
            Item(4,"Tattanapalli"),
            Item(5,"Sreenivasapuram"),
            Item(6,"Lakshmipuram"),
            Item(7,"Boornapalli"),
            Item(8,"Shoolakunta")

        )
    }
}