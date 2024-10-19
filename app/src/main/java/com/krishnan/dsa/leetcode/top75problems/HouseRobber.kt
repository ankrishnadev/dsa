package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(rob(intArrayOf(2, 7, 9, 3, 1)))
}

fun rob(nums: IntArray): Int {

    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    var house1 = 0
    var house2 = 0

    for (num in nums) {
        val temp = maxOf(house1 + num, house2)
        house1 = house2
        house2 = temp
    }
    return house2
}