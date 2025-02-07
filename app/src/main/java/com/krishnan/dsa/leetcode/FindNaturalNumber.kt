package com.krishnan.dsa.leetcode

fun main() {
    val array = intArrayOf(3, 0, 1)
    println(findNaturalNumber(array))
}

fun findNaturalNumber(array: IntArray): Int {
    val n = array.size
    val expectedSum = n * (n + 1) / 2
    val actualSum = array.sum()
    return expectedSum - actualSum
}