package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum1(numbers, target)
    println(result.joinToString(", "))
}

fun twoSum1(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1

    while (left < right) {
        val sum = numbers[left] + numbers[right]

        when {
            sum == target -> return intArrayOf(left + 1, right + 1) // 1-based index
            sum < target -> left++  // Move left pointer right
            else -> right--  // Move right pointer left
        }
    }

    return intArrayOf() // This should never be reached based on the problem constraints
}
