package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val result = threeSum(nums)
    println(result)
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 2) {
        if (i > 0 && nums[i] == nums[i - 1]) continue

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                }

                sum < 0 -> {
                    left++
                }

                else -> {
                    right--
                }
            }
        }
    }

    return result.toList()
}