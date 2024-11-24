package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val points = arrayOf(
        intArrayOf(10, 16),
        intArrayOf(2, 8),
        intArrayOf(1, 6),
        intArrayOf(7, 12)
    )
    println(findMinArrowShots(points))
}

fun findMinArrowShots(points: Array<IntArray>): Int {
    if (points.isEmpty()) return 0
    points.sortBy { it[1] }
    var arrow = 1
    var end = points[0][1]

    for (i in points.indices) {
        if (points[i][0] > end) {
            arrow++
            end = points[i][1]
        }
    }

    return arrow
}