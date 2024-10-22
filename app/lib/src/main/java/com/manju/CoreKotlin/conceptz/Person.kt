package com.manju.CoreKotlin.conceptz

data class Person(val name:String, val age:Int)
fun main(){
    val person=Person("Manju",35)//creating an instance of the data class
    println(person)//automatic toString method

    val person2=Person("Chowdegowda",74)//automatic equals() method
    println(person2)

    println(person==person2)//output false

    val person3 = person.copy(age = 34)//automatic copy method
    println(person3)

    val(hesaru,vayasu)=person2 //destructing declaration
    println("Name:$hesaru, Age:$vayasu")

}
