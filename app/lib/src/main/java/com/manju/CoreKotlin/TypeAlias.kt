package com.manju.CoreKotlin
typealias numberGaluList=List<Int>
typealias aksaraGaluList=List<String>
fun main(){
    println(getNumbers())
    println(getStrings())
}
fun getStrings(): aksaraGaluList {
    return listOf("AAA","BBB","CCC")
}
fun getNumbers(): numberGaluList {
  return listOf(1,2,3)
}
