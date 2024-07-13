package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val flowerbed = arrayOf(0,0,0,0,0,1,0,0)
    println(canPlaceTheFlower(flowerbed, 0))
}

private fun canPlaceTheFlower(flowerbed: Array<Int>, target: Int): Boolean {

    if (target == 0 ) return false

    var n = target
    for (i in flowerbed.indices) {
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1
            n -= 1
        }
        if (n == 0) return true
    }

    return false
}

