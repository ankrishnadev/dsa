package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val array = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3))
    println(eraseOverlapIntervals(array))
}

fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {

    intervals.sortBy { it[1] }
    var preEndInterval = intervals[0][1]
    var removedCount = 0

    for (i in 1 until intervals.size){
        if (intervals[i][0] < preEndInterval){
            removedCount++
        } else {
            preEndInterval = intervals[i][1]
        }
    }

    return removedCount

}