package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val waterLevel = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    println(trap(waterLevel))
}

fun trap(height: IntArray): Int {
    var letf = 0
    var right = height.size - 1
    var leftMax = height[letf]
    var rightMax = height[right]
    var trappedWater = 0

    while (letf < right) {
        if (leftMax < rightMax) {
            letf++
            leftMax = maxOf(leftMax, height[letf])
            trappedWater += maxOf(0, leftMax - height[letf])
        } else {
            right--
            rightMax = maxOf(rightMax, height[right])
            trappedWater += maxOf(0, rightMax - height[right])
        }
    }

    return trappedWater
}