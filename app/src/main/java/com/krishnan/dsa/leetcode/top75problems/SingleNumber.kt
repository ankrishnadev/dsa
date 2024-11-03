package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val array = intArrayOf(2, 2, 1)
    println(singleNumber(array))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0

    for (num in nums){
        result = result xor num
    }

    return result
}