package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(countBits(2).toList())
}

fun countBits(n: Int): IntArray {
    val dp = IntArray(n + 1)
    for (i in 1..n){
        dp[i] = dp[i shr 1] + (i and 1)
    }
    return dp
}