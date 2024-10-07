package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(guessNumber(10))
}

fun guess(num: Int): Int {
    val target = 6  // Let's assume the target number is 42 for this example
    return when {
        num < target -> 1
        num > target -> -1
        else -> 0
    }
}

fun guessNumber(n: Int): Int {
    var left = 0
    var right = n

    while (left <= right) {
        val mid = left + (right - left) / 2
        val result = guess(mid)

        when {
            result == 0 -> return mid
            result < 0 -> right = mid - 1
            result > 0 -> left = mid +1
        }
    }

    return -1
}