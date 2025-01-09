package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val citation = intArrayOf(3, 0, 6, 1, 5)
    println(hIndex(citation))
}

//Sort and Linear scan approach
fun hIndex(citation: IntArray): Int {
    citation.sortDescending()
    var h = 0
    for (i in citation.indices) {
        if (citation[i] >= i + 1) {
            h = i + 1
        } else break
    }

    return h
}