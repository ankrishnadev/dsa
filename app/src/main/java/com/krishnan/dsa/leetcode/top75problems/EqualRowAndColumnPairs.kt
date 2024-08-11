package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val grid = arrayOf(intArrayOf(3, 2, 1), intArrayOf(1, 7, 6), intArrayOf(2, 7, 7))
    println(equalRowAndColumn(grid))
}

private fun equalRowAndColumn(grid: Array<IntArray>): Int {
    val n: Int = grid.size
    var result = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            var equal = 1
            for (k in 0 until n) {
                if (grid[i][k] != grid[k][j]) {
                    equal = 0
                    break
                }
            }
            result += equal
        }
    }

    return result
}