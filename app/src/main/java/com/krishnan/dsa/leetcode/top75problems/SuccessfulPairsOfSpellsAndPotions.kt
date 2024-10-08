package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val spells = intArrayOf(5, 1, 3)
    val potions = intArrayOf(1, 2, 3, 4, 5)
    val success = 7L
    val result = successfulPairs(spells, potions, success)
    println(result.contentToString())
}

fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {

    potions.sort()
    val result = IntArray(spells.size)

    for (i in spells.indices) {
        var right = potions.size - 1
        var left = 0

        while (left <= right) {
            val mid = left + (right - left) / 2
            if ((spells[i] * potions[mid].toLong()) >= success) {
                right = mid - 1
            } else {
                left = mid + 1
            }

        }
        result[i] = potions.size - left
    }

    return result
}

//Partial output
fun successfulPairs1(spells: IntArray, potions: IntArray, success: Long): IntArray {
    potions.sort()
    val result = IntArray(spells.size)

    for (i in spells.indices) {
        val spell = spells[i]
        val requiredPotion = (success + spell - 1) / spell
        val position = potions.binarySearch(requiredPotion.toInt())
        val adjustPosition = if (position < 0) -position - 1 else position
        result[i] = potions.size - adjustPosition
    }

    return result
}