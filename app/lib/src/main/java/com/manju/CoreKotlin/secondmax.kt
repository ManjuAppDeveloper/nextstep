package com.manju.CoreKotlin
val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
fun main() {
    val secondMax=secondMax(nums)
    println(secondMax)
}
fun secondMax(nums: List<Int>): Int {
var max=Int.MIN_VALUE
    var secondMax=Int.MIN_VALUE
    for(i in nums.indices){
        if(nums[i]>max){
            max=nums[i]
        }
    }
    for(i in nums.indices){
        if(nums[i]>secondMax && nums[i]!=max){
            secondMax=nums[i]
        }
    }
    return secondMax
}

