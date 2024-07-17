package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = IntArray(0)
    moveZeros(arr)
}

private fun moveZeros(arr: IntArray): Unit {
    val n = arr.size
    var count = 0
    for (i in 0 until n) {
        if (arr[i] != 0) {
            arr[count++] = arr[i]
        }
    }

    while (count < n) {
        arr[count++] = 0
    }
    println(arr.toList())
}