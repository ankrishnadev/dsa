package com.krishnan.dsa.leetcode.top75problems

import java.util.PriorityQueue

fun main() {
    val costArray = intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8)
    val k = 3
    val candidates = 4
    println(totalCost(costArray, k, candidates))
}

fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
    var total: Long = 0

    var i = candidates
    var j = maxOf(i, costs.size - candidates)

    val queue = PriorityQueue<Int>()

    fun left(c: Int) = queue.add(costs[c] * 2)
    fun right(c: Int) = queue.add(costs[c] * 2 + 1)
    fun addValue(n: Int) {
        total += n / 2
    }

    fun isLeft(n: Int): Boolean = n % 2 == 0

    for (c in 0 until i) {
        left(c)
    }

    for (c in j until costs.size) {
        right(c)
    }

    repeat(k) {
        val v = queue.remove()
        addValue(v)
        if (i < j) {
            if (isLeft(v)) left(i++) else right(--j)
        }
    }
    return total
}