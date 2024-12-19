package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val array = intArrayOf(2, 2, 1, 1, 1, 2, 2)
    println(majorityElement(array))
}

fun majorityElement(array: IntArray): Int {
    var count = 0
    var previousValue: Int = 0
    for (num in array) {
        if (count == 0) {
            previousValue = num
        }
        count += if (num == previousValue) 1 else -1
    }
    return previousValue
}