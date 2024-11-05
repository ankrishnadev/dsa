package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(minFlips(4, 2, 7))
}

fun minFlips(a: Int, b: Int, c: Int): Int {
    var flips = 0
    var x = a
    var y = b
    var z = c

    while (x > 0 || y > 0 || z > 0) {
        val aBit = x and 1
        val bBit = y and 1
        val cBit = z and 1

        if (cBit == 0) {
            // If c's bit is 0, both a and b need to be 0 at this position
            flips += aBit + bBit
        } else {
            // If c's bit is 1, at least one of a or b needs to be 1
            if (aBit == 0 && bBit == 0) {
                flips += 1
            }
        }

        // Shift bits to the right for the next position
        x = x shr 1
        y = y shr 1
        z = z shr 1
    }

    return flips
}