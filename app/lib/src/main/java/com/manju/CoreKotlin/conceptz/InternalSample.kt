package com.manju.CoreKotlin.conceptz

internal class ExampleInternal{
    internal val name="Internal property"
    internal fun greet(){
        println("Hello, $name")
    }
}
fun main(){
    val obj=ExampleInternal()
    println(obj.name)
    obj.greet()
}