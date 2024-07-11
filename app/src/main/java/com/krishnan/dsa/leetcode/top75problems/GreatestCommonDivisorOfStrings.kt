package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val word1 = "ABABAB"
    val word2 = "AB"
    greatestCommonDivisorOfStrings(word1, word2)
}

private fun greatestCommonDivisorOfStrings(word1: String, word2: String): String {

    if ((word1 + word2) != word2 + word1) {
        return ""
    }

    val result = findValue(word1.length, word2.length)
    val finalResult = word1.substring(0, result)
    println(finalResult)
    return finalResult

}

private fun findValue(len1: Int, len2: Int): Int {

    var l1 = len1
    var l2 = len2

    while (l2 != 0) {
        val temp = l2
        l2 = l1 % l2
        l1 = temp
    }
    return l1
}