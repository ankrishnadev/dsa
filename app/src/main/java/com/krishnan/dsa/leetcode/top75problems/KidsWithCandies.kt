package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.max

fun main() {
    val candies = arrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3

    kidsWithCandies(candies, extraCandies)
}

private fun kidsWithCandies(candies: Array<Int>, extraCandies: Int): List<Boolean> {
    val booleanList = mutableListOf<Boolean>()

    var max = candies[0]
    for (i in candies.indices) {
        max = max(candies[i], max)
    }

    for (i in candies.indices) {
        if ((candies[i] + extraCandies) >= max) {
            booleanList.add(true)
        } else {
            booleanList.add(false)
        }
    }
    println(booleanList.toList())
    return booleanList
}