package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = intArrayOf(-4, -3, -2, -1, 4, 3, 2)
    findHighestAltitude(arr)
}

private fun findHighestAltitude(arr: IntArray) {
    var current = 0
    var highest = 0

    for (value in arr) {
        current += value
        if (current > highest) {
            highest = current
        }
    }

    println(highest)
}