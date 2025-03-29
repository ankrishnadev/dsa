package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val input = intArrayOf(1, 2, 3, 4, 5)
    println(minSubArrayLen(11, input))
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {

    var left = 0
    var total = 0
    var answer = Int.MAX_VALUE

    for (right in nums.indices) {
        total += nums[right]

        while (total >= target) {
            answer = minOf(answer, right - left + 1)
            total -= nums[left++]
        }
    }

    return if (answer == Int.MAX_VALUE) 0 else answer
}