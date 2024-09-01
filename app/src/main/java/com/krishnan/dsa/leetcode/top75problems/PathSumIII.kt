package com.krishnan.dsa.leetcode.top75problems

fun pathSum(root: TreeNode?, targetSum: Int): Int {

    val prefixSum = mutableMapOf<Long, Int>()
    prefixSum[0] = 1

    fun dfs(note: TreeNode?, currentSum: Long): Int {
        if (note == null) return 0

        val newSum = currentSum + note.`val`

        var pathCount = prefixSum.getOrDefault(newSum - targetSum, 0)
        prefixSum[newSum] = prefixSum.getOrDefault(newSum, 0) + 1

        pathCount += dfs(note.left, newSum)
        pathCount += dfs(note.right, newSum)

        prefixSum[newSum] = prefixSum[newSum]!! - 1

        return pathCount
    }

    return dfs(root, 0)
}