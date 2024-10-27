package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(uniquePaths(59, 5))
}

fun uniquePaths(m: Int, n: Int): Int {
    val totalMoves = m + n - 2
    val downMoves = minOf(m - 1, n - 1)
    return combination(totalMoves, downMoves)
}

fun combination(n: Int, k: Int): Int {
    var result = 1L

    for (i in 1..k) {
        result = result * (n - i + 1) / i
    }

    return result.toInt()
}