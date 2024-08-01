package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = intArrayOf(1, 1, 1)
    longestSubArray(arr)
}

private fun longestSubArray(arr: IntArray) {
    var left = 0
    var count = 0
    var maxLength = 0

    for (right in arr.indices) {
        if (arr[right] == 0) {
            count++
        }

        while (count > 1) {
            if (arr[left] == 0) {
                count--
            }
            left++
        }

        maxLength = maxOf(maxLength, right - left)
    }

    println(maxLength)

}