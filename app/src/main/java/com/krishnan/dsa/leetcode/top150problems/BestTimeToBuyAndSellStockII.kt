package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfitII(prices))
}

fun maxProfitII(prices: IntArray): Int {
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
           maxProfit += prices[i] - prices[i -1]
        }
    }

    return maxProfit
}