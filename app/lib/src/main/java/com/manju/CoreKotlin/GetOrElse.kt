package com.manju.CoreKotlin
fun main(){
    val data = listOf(1,2,3,4,5,6,7,8,9,0)
    val result=(data.getOrElse(0){
        "No value present"
    })
    println(result)
}