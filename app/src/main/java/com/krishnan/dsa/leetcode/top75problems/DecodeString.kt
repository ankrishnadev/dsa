package com.krishnan.dsa.leetcode.top75problems

import java.util.Stack

fun main() {
    val input = "3[a]2[bc]"
    println(decodeString(input))
}

private fun decodeString(input: String): String {
    var num = 0
    var str = StringBuilder()

    val stackNum = Stack<Int>()
    val stackStr = Stack<StringBuilder>()

    for (char in input) {
        when {
            char.isDigit() -> {
                num = num * 10 + (char - '0')
            }

            char == '[' -> {
                stackNum.push(num)
                stackStr.push(str)
                num = 0
                str = StringBuilder()
            }

            char == ']' -> {
                val counter = stackNum.removeAt(stackNum.size - 1)
                val lastStr = stackStr.removeAt(stackStr.size - 1)
                str = lastStr.append(str.toString().repeat(counter))
            }

            else -> {
                str.append(char)
            }

        }
    }

    return str.toString()
}