package com.krishnan.dsa.leetcode.top150problems

fun main() {
    println(romanToInt("LVIII"))
}

fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        "L" to 50,
        "V" to 5,
        "I" to 1,
        "X" to 10,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    var total = 0
    var previousValue = 0
    for (i in s.length - 1 downTo 0) {
        val currentValue = romanMap[s[i].toString()] ?: 0
        if (currentValue < previousValue) {
            total -= currentValue
        } else {
            total += currentValue
        }
        previousValue = currentValue
    }
    return total
}