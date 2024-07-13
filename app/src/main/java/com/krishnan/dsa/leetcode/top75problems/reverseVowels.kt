package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(reverseVowels("okrieshuna"))
}

fun reverseVowels(s: String): String {
    val isVowels = BooleanArray(128)
    val vowels = "aeiouAEIOU"

    for (i in vowels.toCharArray()) {
        isVowels[i.code] = true
    }

    val charactors = s.toCharArray()

    var i = 0
    var j = charactors.size - 1

    while (i < j) {
        while (i < j && isVowels[charactors[i].code].not()) {
            ++i
        }

        while (i < j && isVowels[charactors[j].code].not()) {
            --j
        }

        if (i < j) {
            val temp = charactors[i]
            charactors[i] = charactors[j]
            charactors[j] = temp

            ++i
            --j
        }
    }

    return charactors.concatToString()
}
