package com.krishnan.dsa.leetcode.top75problems

import java.util.PriorityQueue

fun main() {
    val smallestInfiniteSet = SmallestInfiniteSet()
    println(smallestInfiniteSet.popSmallest())
    println(smallestInfiniteSet.popSmallest())
    smallestInfiniteSet.addBack(1)
    println(smallestInfiniteSet.popSmallest())
}

class SmallestInfiniteSet() {

    private var currentSmallest = 1
    private var minHeap = PriorityQueue<Int>()
    private var removed = mutableSetOf<Int>()

    fun popSmallest(): Int {
        return if (minHeap.isNotEmpty()) {
            val smallest = minHeap.poll()!!
            removed.remove(smallest)
            smallest
        } else {
            currentSmallest++
            currentSmallest - 1
        }
    }

    fun addBack(num: Int) {
        if (num < currentSmallest && !removed.contains(num)) {
            removed.add(num)
            removed.add(num)
        }
    }

}