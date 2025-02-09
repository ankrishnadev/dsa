package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val input = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(input))
    println(longestCommonPrefix1(input))
}

//Sorting & Comparing First and Last Strings
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    val first = strs[0]
    val last = strs[strs.size - 1]
    var i = 0

    while (i < first.length && i < last.length && first[i] == last[i]) {
        i++
    }

    return first.substring(0, i)
}

//Horizontal Scanning - right approach for all unit case
fun longestCommonPrefix1(strs: Array<String>): String {
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while (strs[i].startsWith(prefix).not()) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }

    return prefix
}