package com.manju.CoreKotlin

fun main(){
    var name= getUserName(2.3)
    println(name)
}
fun getUserName(i: Double): Double? {
return if (i==2.2) i else null
}
