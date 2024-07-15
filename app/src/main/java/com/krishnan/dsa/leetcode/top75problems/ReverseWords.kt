package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val words = "  hello    world  "
    val reverse = reverseWords(words)
    println(reverse)
}

fun reverseWords(s: String): String {
    val temp = s.trim()
    val arr = temp.split(" ")
    val sb = StringBuilder()
    for (i in arr.size - 1 downTo 0) {
        val str = arr[i]
        if (str.isBlank()) continue

        sb.append(str)
        if (i != 0) sb.append(" ")
    }
    return sb.toString()
}