package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val citation = intArrayOf(3, 0, 6, 1, 5)
    println(hIndex(citation))
    println(hIndex1(citation))
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

//Counting sort approach (Optimized for large datasets)
fun hIndex1(citation: IntArray): Int {
    val n = citation.size
    val count = IntArray(n + 1)

    for (value in citation) {
        if (value >= n){
            count[n]++
        } else {
            count[value]++
        }
    }

    var total = 0
    for (i in n downTo 0) {
        total += count[i]
        if (total >= i) {
            return i
        }
    }

    return 0
}