package com.manju.CoreKotlin

fun main(){
    val inputData=5
    var fact:Long=1
    //1*2*....inputnumber
    for(i in 1..inputData){
        fact=fact*i
    }
println("the factorial of $inputData is = $fact")
}