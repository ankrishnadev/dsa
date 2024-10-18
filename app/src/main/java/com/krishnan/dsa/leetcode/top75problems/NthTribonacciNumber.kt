package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(tribonacci(25))
}

fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1

    var t0 = 0
    var t1 = 1
    var t2 = 1

    for (i in 3..n) {
        val tOfn = t0 + t1 + t2
        t0 = t1
        t1 = t2
        t2 = tOfn
    }

    return t2
}