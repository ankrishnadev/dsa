package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotate(array, 3)
    println(array.joinToString(", "))
}

fun rotate(array: IntArray, k: Int) {
    val n = array.size
    val rotatedArray = IntArray(n)
    val steps = k % n

    for (i in array.indices) {
        rotatedArray[(i + steps) % n] = array[i]
    }

    for (i in array.indices) {
        array[i] = rotatedArray[i]
    }
}