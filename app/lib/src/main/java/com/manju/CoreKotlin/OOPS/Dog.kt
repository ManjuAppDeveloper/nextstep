package com.manju.CoreKotlin.OOPS

class Dog(override val name: String, val action:String) :Animal{
    override fun sound() {
        println(" the $name is $action")
    }

    override fun eat() {
        super.eat()
        println("Its okay no problem")
    }

}
fun main(){
    val dogObj = Dog("Brownie","Barks")
    dogObj.sound()
    dogObj.eat()

}