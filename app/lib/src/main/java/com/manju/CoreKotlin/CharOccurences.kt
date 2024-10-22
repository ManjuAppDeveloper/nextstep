package com.manju.CoreKotlin
fun main() {
    val data = "Happy Independence Day"
    val charCountMap = mutableMapOf<Char, Int>()
    // Loop through each character in the string
    for (char in data) {
        // Increment the count of the character in the map
        if (char in charCountMap) {
            charCountMap[char] = charCountMap[char]!! + 1
        } else {
            charCountMap[char] = 1
        }
    }
    // Print the occurrences of each character
    for ((char, count) in charCountMap) {
        println("Character '$char' occurs $count times")
    }
}
