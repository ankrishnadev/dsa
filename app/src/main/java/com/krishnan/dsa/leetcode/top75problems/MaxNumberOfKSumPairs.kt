package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = arrayOf(3, 1, 3, 4, 3)
    sumPairs(arr, 5)
}

private fun sumPairs(arr: Array<Int>, k: Int) {

    arr.sort()
    var i = 0
    var length = arr.size - 1
    var result = 0
    while (i < length) {
        val sum = arr[i] + arr[length]
        if (sum == k) {
            result++
            i++
            length--
        } else if (sum > k) {
            --length
        } else {
            ++i
        }
    }
    println(result)
}