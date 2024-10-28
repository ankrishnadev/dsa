package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val text1 = "abcde"
    val text2 = "ace"
    println(longestCommonSubsequence(text1, text2))
}

fun longestCommonSubsequence(text1: String, text2: String): Int {

    val len1 = text1.length
    val len2 = text2.length

    // Create a DP table with dimensions (m+1) x (n+1)
    val dp = Array(len1 + 1) { IntArray(len2 + 1) }

    for (i in 1..len1) {
        for (j in 1..len2) {
            if (text1[i - 1] == text2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    return dp[len1][len2]

}