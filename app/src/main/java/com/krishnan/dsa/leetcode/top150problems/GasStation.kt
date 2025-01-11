package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val gas = intArrayOf(1, 2, 3, 4, 5)
    val cost = intArrayOf(3, 4, 5, 1, 2)
    println(canCompleteCircuit(gas, cost))
}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var total = 0
    var current = 0
    var startStation = 0

    for (i in gas.indices) {
        val balance = gas[i] - cost[i]
        total += balance
        current += balance

        if (current < 0){
            startStation = i + 1
            current = 0
        }
    }

    return if (total >= 0) startStation else -1
}