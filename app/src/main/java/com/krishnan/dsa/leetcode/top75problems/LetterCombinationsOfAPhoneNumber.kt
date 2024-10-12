package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val digits = "23"
    println(letterCombinations(digits))
}

fun letterCombinations(digits: String): List<String> {

    if (digits.isEmpty()) return emptyList()

    val phoneMap = mapOf(
        '2' to "abc", '3' to "def", '4' to "ghi",
        '5' to "jkl", '6' to "mno", '7' to "pqrs",
        '8' to "tuv", '9' to "wxyz"
    )

    val combinations = mutableListOf<String>()

    fun backTracking(index: Int, path: StringBuilder) {

        if (index == digits.length) {
            combinations.add(path.toString())
            return
        }

        val letters = phoneMap[digits[index]] ?: return

        for (letter in letters) {
            path.append(letter)
            backTracking(index + 1, path)
            path.deleteCharAt(path.length - 1)
        }
    }

    backTracking(0, StringBuilder())
    return combinations
}

