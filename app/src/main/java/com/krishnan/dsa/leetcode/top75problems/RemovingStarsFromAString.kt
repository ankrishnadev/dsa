package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val str = "leet**cod*e"
    removingStar(str)
}

private fun removingStar(str: String) {
    val stringBuilder = StringBuilder()
    for (i in str.indices) {
        if (str[i] == '*') {
            stringBuilder.deleteCharAt(stringBuilder.length - 1)
        } else {
            stringBuilder.append(str[i])
        }
    }

    println(stringBuilder.toString())
}