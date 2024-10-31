package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val prices = intArrayOf(1, 3, 2, 8, 4, 9)
    println(maxProfit(prices, 2))
}

fun maxProfit(prices: IntArray, fee: Int): Int {
    var hold = -prices[0]
    var cash = 0

    for (i in 1 until prices.size) {
        hold = maxOf(hold, cash - prices[i])
        cash = maxOf(cash, hold + prices[i] - fee)
    }

    return cash
}