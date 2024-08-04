package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = intArrayOf(1, 7, 3, 6, 5, 6)
    findPivotIndex(arr)
}

private fun findPivotIndex(arr: IntArray) {
    val totalSum = arr.sum()
    var leftSum = 0
    var pivot = 0
    for (value in arr.indices) {
        if (leftSum == (totalSum - leftSum - arr[value])) {
            pivot = value
        }
        leftSum += arr[value]
    }

    println(pivot)
}