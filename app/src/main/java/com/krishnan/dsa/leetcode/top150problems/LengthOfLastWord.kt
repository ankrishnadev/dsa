package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val value = "Krishna is ingenuity developer"
    println(findLengthOfLastWord(value))
}

fun findLengthOfLastWord(string: String): Int {
    var count = 0
    for (i in string.length - 1 downTo 0) {
        if (string[i] != ' ') count++
        if (string[i] == ' ' && count != 0) break
    }
    return count
}

fun mySubmission(string: String): Int {
    val stringArr = string.trim()
    val lastString = stringArr.split(" ").last()
    return lastString.length
}