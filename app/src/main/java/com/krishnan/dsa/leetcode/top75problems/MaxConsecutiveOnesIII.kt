package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val input = intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0)
    maxConsecutiveOnesIII(input, 2)
}

private fun maxConsecutiveOnesIII(input: IntArray, k: Int) {
    var left = 0
    var maxCount = 0
    var count = 0

    for (right in input.indices) {
        if (input[right] == 0) {
            count++
        }

        while (count > k) {
            if (input[left] == 0) {
                count--
            }
            left++
            input[right] = 1
        }

        maxCount = maxOf(maxCount, (right - left + 1))
    }
    println(maxCount)
    println(input.toList())
}