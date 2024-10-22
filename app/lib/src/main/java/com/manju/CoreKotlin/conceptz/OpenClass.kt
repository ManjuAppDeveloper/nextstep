package com.manju.CoreKotlin.conceptz

open class Animal{
    open val name="Lion"
    open fun sound(){
        println("Animal makes sound")
    }
}
class Dog :Animal(){
    override fun sound() {
        super.sound()
    }

    override val name: String
        get() = super.name
}
fun main(){
 val animal=Animal()
    val dog=Dog()
 animal.sound()
    dog.sound()
    println(dog.name)
}