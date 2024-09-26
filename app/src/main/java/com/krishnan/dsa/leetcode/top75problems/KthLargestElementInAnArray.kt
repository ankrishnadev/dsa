package com.krishnan.dsa.leetcode.top75problems

import java.util.PriorityQueue

fun main() {
    val nums = intArrayOf(3, 2, 1, 5, 6, 4)
    val k = 4
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

    return minHeap.peek() ?: 0

}