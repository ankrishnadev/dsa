package com.krishnan.dsa.leetcode.top150problems

import kotlin.math.min

fun main() {
    val input = intArrayOf(2, 3, 1, 2, 4, 3)
    println(minSubArrayLen(7, input))
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {

    var left = 0
    var total = 0
    var result = Int.MAX_VALUE

    for (i in nums.indices) {
        total += nums[i]
        while (total >= target){
            result = min(result, i + 1 - left)
            total -= nums[left++]
        }
    }

    return if(result == Int.MAX_VALUE) 0 else result
}