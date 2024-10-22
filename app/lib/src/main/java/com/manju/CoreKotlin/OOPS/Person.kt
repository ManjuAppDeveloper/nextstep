package com.manju.CoreKotlin.OOPS

class Person(val id:Int, val name:String, val place:String, val contact: Long) {

    fun printId(){
    println("the Person id is $id")
    }
    fun printName(){
        println("the Person name is $name")
    }

    fun printPlace(){
        println("the person's place is $place")
    }

    fun printContact(){
        println("the person's contact is $contact")
    }

}
fun main(){
    val personObj=Person(7,"Manjunath PM","Pannapalli", 8300463846)

    personObj.printId()
    personObj.printName()
    personObj.printPlace()
    personObj.printContact()
}