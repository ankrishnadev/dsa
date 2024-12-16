package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val array = intArrayOf(3, 2, 2, 3)
    println(removeElement(array, 3))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}