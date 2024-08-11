package com.krishnan.dsa.leetcode.top75problems

import java.util.Arrays


fun main() {
    val str1 = "cabbba"
    val str2 = "abbccc"
    println(closeStrings(str1, str2))
}

fun closeStrings(word1: String, word2: String): Boolean {
    val count1 = IntArray(26)
    val count2 = IntArray(26)
    for (i in word1.indices) {
        ++count1[word1[i] - 'a']
    }
    for (i in word2.indices) {
        ++count2[word2[i] - 'a']
    }
    for (i in 0..25) {
        if ((count1[i] == 0) != (count2[i] == 0)) {
            return false
        }
    }
    Arrays.sort(count1)
    Arrays.sort(count2)
    return count1.contentEquals(count2)
}