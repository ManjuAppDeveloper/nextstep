package com.manju.CoreKotlin.conceptz
fun main(){
    println(defineNumber(100))
}
fun defineNumber(i: Int): Any {
    return when(i){
        100 -> "Centum"
        90 -> "Distiction"
        in 70..89 -> "First class"
        in 60..69->"Second class"
        in  50..59-> "Third class"
        else ->"Nothing"
    }
}
/*
fun defineNumber(number:Int):Char{
    return when(number){
        100 -> 'O'
        90->'A'
        80 ->'B'
        70 -> 'C'
        60 -> 'D'
        50 -> 'E'
        in 0..49 -> 'F'
        else ->'N'
    }
}*/
