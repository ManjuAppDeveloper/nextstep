package com.manju.CoreKotlin
fun findFirstNonRepeatingCharIndex(s: String): Pair<Char?, Int> {
    val charCountMap = mutableMapOf<Char, Int>()
    // Step 1: Count the occurrences of each character
    for (char in s) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }
    // Step 2: Find the first non-repeating character's index
    for (i in s.indices) {
        if (charCountMap[s[i]] == 1) {
            return Pair(s[i], i)
        }
    }
    // Step 3: If no non-repeating character is found, return null and -1
    return Pair(null, -1)
}
fun main() {
    val sampleString = "himanshu"
    val (nonRepeatingChar, index) = findFirstNonRepeatingCharIndex(sampleString)

    if (nonRepeatingChar != null) {
        println("The first non-repeating character is '$nonRepeatingChar' at index $index")
    } else {
        println("There is no non-repeating character in the string.")
    }
}
