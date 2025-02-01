package com.krishnan.dsa.leetcode

import java.util.Stack

fun main() {
    println(isValidParentheses("()[]}"))
}

fun isValidParentheses(s: String): Boolean {
    val stack = Stack<Char>()
    val backerPair = mapOf(')' to '(', ']' to '[', '}' to '{')

    for (char in s) {
        if (char in backerPair.values) {
            stack.push(char)
        } else if (char in backerPair.keys) {
            if (stack.isEmpty() || stack.pop() != backerPair[char]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}