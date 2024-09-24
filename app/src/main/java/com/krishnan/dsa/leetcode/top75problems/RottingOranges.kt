package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue

fun main() {
    val grid1 = arrayOf(
        intArrayOf(2, 1, 1),
        intArrayOf(1, 1, 0),
        intArrayOf(0, 1, 1)
    )
    println(orangesRotting(grid1))
}

fun orangesRotting(grid: Array<IntArray>): Int {

    val direction = listOf(
        intArrayOf(-1, 0),//up
        intArrayOf(1, 0),//down
        intArrayOf(0, 1),//right
        intArrayOf(0, -1)//left
    )

    val rows = grid.size
    val cols = grid[0].size
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()

    var freshOranges = 0
    var timeInterval = 0

    for (row in 0 until rows) {
        for (col in 0 until cols) {
            when (grid[row][col]) {
                2 -> queue.offer(Triple(row, col, 0))
                1 -> freshOranges++
            }
        }
    }

    if (freshOranges == 0) return 0

    while (queue.isNotEmpty()) {
        val (row, col, time) = queue.poll()!!
        timeInterval = time

        for (direction in direction) {
            val newRow = row + direction[0]
            val newCol = col + direction[1]

            if (newRow in 0 until rows && newCol in 0 until cols && grid[newRow][newCol] == 1) {
                grid[newRow][newCol] = 2
                freshOranges--
                queue.offer(Triple(newRow, newCol, time + 1))
            }
        }

    }

    return if (freshOranges == 0) timeInterval else -1
}