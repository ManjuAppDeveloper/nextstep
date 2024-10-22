package com.manju.CoreKotlin.conceptz
class Example{
    private val name="private property"
    private fun greet(){
        println("Hello, $name")
    }
    fun helloData(){
        greet()
    }
}
fun main(){
    val obj=Example()
    obj.helloData()
}