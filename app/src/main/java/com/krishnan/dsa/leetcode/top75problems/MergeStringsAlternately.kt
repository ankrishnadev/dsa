package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.min

fun main() {
    val word1 = "ace"
    val word2 = "bd"
    mergeAlternately(word1, word2)
}

fun mergeTwoStringAlternatively(word1: String, word2: String) {
    var i = 0
    val stringBuilder = StringBuilder()
    while (i < word1.length || i < word2.length) {
        if (i < word1.length) {
            stringBuilder.append(word1[i])
        }
        if (i < word2.length) {
            stringBuilder.append(word2[i])
        }
        i++
    }
    println(stringBuilder)

}

//Less complexity
fun mergeAlternately(word1: String, word2: String): String {
    val sb = StringBuilder()
    val size = min(word1.length, word2.length)
    for (i in 0 until size) {
        sb.append(word1[i]).append(word2[i])
    }
    if (word1.length > word2.length) {
        sb.append(word1.substring(word2.length))
    } else {
        sb.append(word2.substring(word1.length))
    }
    return sb.toString()
}