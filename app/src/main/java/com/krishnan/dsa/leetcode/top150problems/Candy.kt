package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val candies = intArrayOf(1,3,4,5,2)
    println(candy(candies))
}

fun candy(ratings: IntArray): Int {
    val n = ratings.size
    val candies = IntArray(n) { 1 }

    //First pass = left to right.
    for (i in 1 until n) {
        if (ratings[i] > ratings[i - 1]) {
            candies[i] = candies[i - 1] + 1
        }
    }


    //Second pass = right to left
    for (i in n - 2 downTo 0) {
        if (ratings[i] > ratings[i + 1]) {
            candies[i] = maxOf(candies[i], candies[i + 1] + 1)
        }
    }

    return candies.sum()
}