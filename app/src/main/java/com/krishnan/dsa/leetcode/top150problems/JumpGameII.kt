package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val intArray = intArrayOf(2, 3, 1, 1, 4)
    println(jumpWithDynamicApproach(intArray))
}

// Greedy approach
fun jump(nums: IntArray): Int {
    var jumbs = 0
    var currentEnd = 0
    var furthest = 0

    for (i in 0 until nums.lastIndex) {
        furthest = maxOf(furthest, i + nums[i])

        if (i == currentEnd) {
            jumbs++
            currentEnd = furthest

            if (currentEnd >= nums.lastIndex) break
        }
    }
    return jumbs
}

// Dynamic programming
fun jumpWithDynamicApproach(nums: IntArray): Int {
    val n = nums.lastIndex
    val dpArray = IntArray(n) { Int.MAX_VALUE }
    dpArray[0] = 0

    for (i in 0 until n) {
        for (j in i + 1..minOf(i + nums[i], n - 1)) {
            dpArray[j] = minOf(dpArray[j], dpArray[i] + 1)
        }
    }

    return dpArray.last()
}
