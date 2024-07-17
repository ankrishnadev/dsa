package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val arr = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')
    stringCompression1(arr)
}

private fun stringCompression1(chars: CharArray): Int {

    val n: Int = chars.size
    if (n == 0) return 0

    val s = java.lang.StringBuilder()
    var count = 1

    for (i in 1 until n) {
        if (chars[i] == chars[i - 1]) {
            count++
        } else {
            s.append(chars[i - 1])
            if (count > 1) {
                s.append(count)
            }
            count = 1
        }
    }

    s.append(chars[n - 1])
    if (count > 1) {
        s.append(count)
    }

    for (i in s.indices) {
        chars[i] = s[i]
    }
    println(s.toString())
    return s.length
}