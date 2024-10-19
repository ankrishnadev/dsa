package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(minCostClimbingStairs(intArrayOf(10, 15, 20)))
}

fun minCostClimbingStairs(cost: IntArray): Int {
    val n = cost.size

    if (n == 0) return 0
    if (n == 1) return cost[0]

    var prev1 = cost[1]
    var prev2 = cost[0]

    for (i in 2 until n) {
        val current = minOf(prev1, prev2) + cost[i]
        prev2 = prev1
        prev1 = current
    }

    return minOf(prev1, prev2)
}