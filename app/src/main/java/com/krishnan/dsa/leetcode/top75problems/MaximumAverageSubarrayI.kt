package com.krishnan.dsa.leetcode.top75problems

import kotlin.math.max

fun main() {
    val arr = arrayOf(1, 12, -5, -6, 50, 3)
    maximumAverageSubArrayI(arr, 4)
}

private fun maximumAverageSubArrayI(arr: Array<Int>, k: Int) {
    var start = 0
    var ans: Int
    arr.sum()
    for (i in 0 until k) {
        start += arr[i]
    }

    ans = start
    for (i in k until arr.size) {
        start += (arr[i] - arr[i - k])
        ans = max(ans, start)
    }

    println(ans * 1.0 / k)

}