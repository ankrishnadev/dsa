package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.max
import kotlin.math.min

fun main() {
    val arr = intArrayOf(2, 1, 5, 0, 4, 6)
    println(increasingTriplet(arr))
}

fun increasingTriplet(nums: IntArray): Boolean {
    val hasLess = BooleanArray(nums.size)
    var min = Int.MAX_VALUE
    for (i in nums.indices) {
        hasLess[i] = min < nums[i]
        min = min(min, nums[i])
    }
    var max = Int.MIN_VALUE
    for (i in nums.indices.reversed()) {
        if (hasLess[i] && max > nums[i]) return true
        max = max(max, nums[i])
    }
    return false
}