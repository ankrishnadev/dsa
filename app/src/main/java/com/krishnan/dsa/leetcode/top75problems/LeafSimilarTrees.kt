package com.krishnan.dsa.leetcode.top75problems

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    fun dfs(node: TreeNode?): List<Int> {
        if (node == null) return emptyList()
        if (node.left == null && node.right == null) return listOf(node.`val`)
        return dfs(node.left) + dfs(node.right)
    }

    return dfs(root1) == dfs(root2)
}