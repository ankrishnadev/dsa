package com.krishnan.dsa.leetcode.top150problems


fun main() {
    val inputArray = intArrayOf(2, 7, 11, 1)
    println(twoSum(inputArray, 9).toList())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIndex: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        if (numToIndex.containsKey(target - nums[i])) {
            val result = numToIndex[target - nums[i]]
            return intArrayOf(result ?: 0, i)
        }

        numToIndex[nums[i]] = i
        println("Result : $numToIndex")
    }

    throw IllegalArgumentException()
}
