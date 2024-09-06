package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue

fun rightSideView(root: TreeNode?): List<Int> {
    val list = mutableListOf<Int>()
    if (root == null) return emptyList()
    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)

    while (queue.isNotEmpty()) {
        val size = queue.size

        for (i in 0 until size) {
            val node = queue.poll()
            if (i == size - 1) {
                list.add(node.`val`)
            }

            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }

    }

    return list
}
