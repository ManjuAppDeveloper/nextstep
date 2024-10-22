package com.manju.CoreKotlin

fun main(){
   val data= getUserName(1);
   // println(data)
    //val length = data!!.length
    //val length = data?.length
    //println(length)
    //val displayName = data?:"Legacy"
    //println(displayName)
    //val obj:Any = "123"
    //val name:String? = obj as? String
    //println(name)

    // the let function can be used with the safe call operator if the value of the variable is not null
    data?.let{
        println("the name is $it")
    }
}
fun getUserName(id:Int):String?{
    return if(id==1) "Manju" else null
}