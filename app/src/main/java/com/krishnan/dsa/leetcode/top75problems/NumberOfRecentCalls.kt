package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue


class NumberOfRecentCalls {
    private val queue: Queue<Int> = LinkedList<Int>()
    fun ping(t: Int): Int {
        queue.add(t)
        while (queue.peek() < t - 3000) {
            queue.poll()
        }
        return queue.size
    }
}
