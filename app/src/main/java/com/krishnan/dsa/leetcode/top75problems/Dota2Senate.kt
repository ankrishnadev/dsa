package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue

fun main() {
    val input = "RDD"
    println(dota2Senate(input))
}

private fun dota2Senate(senate: String): String {
    val radiantQueue: Queue<Int> = LinkedList<Int>()
    val direQueue: Queue<Int> = LinkedList<Int>()

    for (i in senate.indices) {
        if (senate[i] == 'R') {
            radiantQueue.add(i)
        } else {
            direQueue.add(i)
        }
    }

    while (radiantQueue.isNotEmpty() && direQueue.isNotEmpty()) {
        val rIndex = radiantQueue.poll()
        val dIndex = direQueue.poll()

        if (rIndex < dIndex) {
            radiantQueue.add(rIndex + senate.length)
        } else {
            direQueue.add(dIndex + senate.length)
        }
    }

    return if (radiantQueue.isNotEmpty()) "Radiant" else "Dire"
}