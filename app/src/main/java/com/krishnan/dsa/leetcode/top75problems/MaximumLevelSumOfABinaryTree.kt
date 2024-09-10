package com.krishnan.dsa.leetcode.top75problems

import java.util.LinkedList
import java.util.Queue

fun maxLevelSum(root: TreeNode?): Int {
    if (root == null) return 0

    var maxSum = Int.MIN_VALUE
    var maxLevel = 1
    var currentLevel = 1
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        var levelSum = 0
        var levelSize = queue.size

        for (i in 0 until levelSize) {
            val node = queue.poll()
            levelSum += node.`val`

            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }

        }

        if (levelSum > maxSum) {
            maxSum = levelSum
            maxLevel = currentLevel
        }

        currentLevel++
    }

    return maxLevel
}