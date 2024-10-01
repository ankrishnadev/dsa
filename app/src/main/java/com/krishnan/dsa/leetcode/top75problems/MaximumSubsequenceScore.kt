package com.krishnan.dsa.leetcode.top75problems

import java.util.PriorityQueue

fun main() {
    val nums1 = intArrayOf(4, 2, 3, 1, 1)
    val nums2 = intArrayOf(7, 5, 10, 9, 6)
    val k = 1
    println(maxScore(nums1, nums2, k))
}

fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {

    val pairArray = nums1.zip(nums2).sortedByDescending { (_, second) -> second }
    val maxHeap = PriorityQueue<Int>()
    var (currentSum, maxScore) = 0L to 0L

    for ((i, score) in pairArray) {
        maxHeap.add(i)
        currentSum += i

        if (maxHeap.size > k) {
            currentSum -= maxHeap.poll()!!
        }

        if (maxHeap.size == k) {
            maxScore = maxOf(maxScore, score * currentSum)
        }
    }

    return maxScore
}