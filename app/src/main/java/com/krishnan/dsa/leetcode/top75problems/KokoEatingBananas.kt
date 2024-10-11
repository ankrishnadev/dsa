package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.ceil

fun main() {
    val piles = intArrayOf(312884470)
    val h = 312884469
    println(minEatingSpeed(piles, h))
}

fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var left = 1
    var right = piles.maxOrNull() ?: 0

    fun finished(k: Int): Boolean {
        var hours = 0.0
        for (pile in piles) {
            hours += ceil(pile.toFloat() / k)
        }

        return hours <= h
    }

    while (left < right) {
        val mid = left + (right - left) / 2

        if (finished(mid)) {
            right = mid
        } else {
            left = mid + 1
        }
    }

    return left
}