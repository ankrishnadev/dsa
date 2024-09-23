package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue

fun main() {
    val maze1 = arrayOf(
        charArrayOf('+', '+', '+'),
        charArrayOf('.', '.', '.'),
        charArrayOf('+', '+', '+')
    )
    val entrance1 = intArrayOf(1, 0)
    println(nearestExit(maze1, entrance1))
}

fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {

    val direction = arrayOf(
        intArrayOf(-1, 0), //up
        intArrayOf(1, 0), //down
        intArrayOf(0, 1), //right
        intArrayOf(0, -1) //left
    )

    val rows = maze.size
    val cols = maze[0].size

    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
    queue.add(Triple(entrance[0], entrance[1], 0))

    maze[entrance[0]][entrance[1]] = '+'

    while (queue.isNotEmpty()) {
        val (row, col, steps) = queue.poll()!!

        for (dir in direction) {
            val newRow = row + dir[0]
            val newCol = col + dir[1]

            if (newRow in 0 until rows && newCol in 0 until cols && maze[newRow][newCol] == '.') {
                if (newRow == 0 || newRow == rows - 1 || newCol == 0 || newCol == cols - 1) {
                    return steps + 1
                }

                maze[newRow][newCol] = '+'
                queue.add(Triple(newRow, newCol, steps + 1))
            }
        }
    }

    return -1
}