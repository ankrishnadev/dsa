package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.max
import kotlin.math.min

fun main() {
    val input = arrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    containerWater(input)
}

private fun containerWater(input: Array<Int>): Int {
    var left = 0
    var right = input.size - 1
    var maxArea = 0

    while (left < right) {
        val area = min(input[left], input[right]) * (right - left)
        maxArea = max(area, maxArea)

        if (input[left] < input[right]) {
            left++
        } else {
            right--
        }
    }
    return maxArea
}