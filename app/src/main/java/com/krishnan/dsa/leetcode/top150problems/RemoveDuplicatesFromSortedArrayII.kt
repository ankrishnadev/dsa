package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val intArray = intArrayOf(1,1,1,2,2,3)
    println(removeDuplicatesII(intArray))
}

fun removeDuplicatesII(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var index = 2
    for (i in 2 until nums.size) {
        if (nums[i] != nums[i - 2]) {
            nums[index] = nums[i]
            index += 1
        }
    }
    return index
}