package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val intArray = intArrayOf(2, 0, 0)
    println(canJump(intArray))
}

fun canJump(nums: IntArray): Boolean {
    var maxJump = nums.size - 1
    for (i in nums.size - 2 downTo 0) {
        if (i + nums[i] >= maxJump){
            maxJump = i
        }
    }
    return maxJump == 0
}
