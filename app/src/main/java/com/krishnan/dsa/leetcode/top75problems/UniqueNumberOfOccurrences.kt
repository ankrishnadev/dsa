package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = intArrayOf(1, 2, 2, 1, 1, 3)
    //val arr1 = arrayOf("red", "red", "green", "green", "blue")
    println(uniqueNumberOfOccurrences(arr))
}

private fun uniqueNumberOfOccurrences(arr: IntArray): Boolean {
    val freqCount = mutableMapOf<Int, Int>()
    val freq = mutableMapOf<Int, Int>()

    for (i in arr) {
        freqCount[i] = freqCount.getOrDefault(i, 0) + 1
    }

    for (i in freqCount.values) {
        freq[i] = freq.getOrDefault(i, 0) + 1
    }

    return freq.values.all { it == 1 }
}

private fun uniqueNumberOfOccurrences1(arr: Array<String>) {
    val freqCount = mutableMapOf<String, Int>()

    for (i in arr) {
        freqCount[i] = freqCount.getOrDefault(i, 0) + 1
    }

    println(freqCount.map { "${it.key} : ${it.value}" }.joinToString (", " ))
}
