package com.krishnan.dsa.leetcode.top75problems

import java.util.PriorityQueue
import kotlin.random.Random

fun main() {
    val nums = intArrayOf(3, 2, 1, 5, 6, 4)
    val k = 2
    println(findKthLargest(nums, k))
}

fun findKthLargest(nums: IntArray, k: Int): Int {
    val minHeap = PriorityQueue<Int>()

    for (num in nums) {
        minHeap.add(num)
        if (minHeap.size > k) {
            minHeap.poll()
        }
    }

    quickSelect(nums, 0, nums.size - 1, nums.size - k)

    return minHeap.peek() ?: 0
}

fun quickSelect(nums: IntArray, left: Int, right: Int, kSmallest: Int): Int {

    if (left == right) return nums[left]

    val pivotIndex = Random.nextInt(left, right + 1)
    val pivotFinalIndex = partition(nums, left, right, pivotIndex)

    return when {
        kSmallest == pivotFinalIndex -> nums[kSmallest]
        kSmallest < pivotFinalIndex -> quickSelect(nums, left, pivotFinalIndex - 1, kSmallest)
        else -> quickSelect(nums, pivotFinalIndex + 1, right, kSmallest)
    }

}

fun partition(nums: IntArray, left: Int, right: Int, pivotIndex: Int): Int {

    val pivotValue = nums[pivotIndex]
    nums.swap(pivotIndex, right)
    var storeIndex = left

    for (i in left until right) {
        if (nums[i] < pivotValue) {
            nums.swap(storeIndex, i)
            storeIndex++
        }
    }
    nums.swap(storeIndex, right)
    return storeIndex

}

fun IntArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}