package com.krishnan.dsa.leetcode.top75problems


private var maxLength = 0

fun main() {
    fun longestZigZag(root: TreeNode?): Int {
        if (root == null) return 0
        return maxOf(dfs(root.left, false, 1), dfs(root.right, true, 1))
    }
}

fun dfs(node: TreeNode?, isLeft: Boolean, length: Int): Int {
    if (node == null) {
        return length - 1
    }

    return if (isLeft) {
        maxOf(dfs(node.left, false, length + 1), dfs(node.right, true, 1))
    } else {
        maxOf(dfs(node.right, true, length + 1), dfs(node.left, false, 1))
    }
}


