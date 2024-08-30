package com.krishnan.dsa.leetcode.top75problems


fun goodNodes(root: TreeNode?): Int {

    fun dfs(root: TreeNode?, maxVal: Int): Int {

        if (root == null) return 0
        val good = if (root.`val` >= maxVal) 1 else 0
        val maxValue = maxOf(maxVal, root.`val`)
        return good + dfs(root.left, maxValue) + dfs(root.right, maxValue)
    }

    return dfs(root, Int.MAX_VALUE)
}