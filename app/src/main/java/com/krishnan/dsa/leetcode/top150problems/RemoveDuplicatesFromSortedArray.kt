package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val intArray = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicates(intArray))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var index = 1
    for (i in 1 until nums.size){
        if (nums[i] != nums[i-1]){
            nums[index] = nums[i]
            index++
        }
    }
    return index
}