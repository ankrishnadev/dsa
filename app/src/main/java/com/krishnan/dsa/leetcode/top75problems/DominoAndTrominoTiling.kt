package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(numTilings(5))
}

fun numTilings(n: Int): Int {
    val mod = 1_000_000_007
    if (n == 0) return 0
    if (n == 1) return 1
    if (n == 2) return 2

    val dp = LongArray(n)
    dp[0] = 1
    dp[1] = 2
    dp[2] = 5

    for (i in 3 until n) {
        val temp = dp[0]
        dp[0] = dp[1]
        dp[1] = dp[2]
        dp[2] = ((dp[2] * 2 + temp) % mod)
    }

    return dp[2].toInt()
}