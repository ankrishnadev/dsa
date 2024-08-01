package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.max

fun main() {
    val input = "abciiidef"
    maxVowels(input, 3)
}

private fun maxVowels(input: String, k: Int): Int {
    var maxNum = 0
    var maxVowels = 0
    for (i in 0 until k) {
        if (isVowels(input[i])) {
            maxNum++
        }
    }

    maxVowels = maxNum
    for (i in k until input.length) {
        if (isVowels(input[i])) {
            maxNum++
        }

        if (isVowels(input[i - k])) {
            maxNum--
        }

        maxVowels = max(maxVowels, maxNum)
    }
    println(maxVowels)
    return maxVowels
}

private fun isVowels(c: Char): Boolean {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
}