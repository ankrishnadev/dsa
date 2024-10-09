package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println(findPeakElement(nums))
}

fun findPeakElement(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1


    while (left < right) {
        val mid = left + (right - left) / 2
        if (nums[mid] > nums[mid + 1]) {
            right = mid
        } else {
            left = mid + 1
        }

    }
    return left
}