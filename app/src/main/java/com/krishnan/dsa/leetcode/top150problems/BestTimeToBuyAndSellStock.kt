package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }
    }

    return maxProfit
}