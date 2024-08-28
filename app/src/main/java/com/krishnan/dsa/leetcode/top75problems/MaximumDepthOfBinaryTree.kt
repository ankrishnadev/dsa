package com.krishnan.dsa.leetcode.top75problems

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        } else {
            val leftDepth = maxDepth(root.left)
            val rightDepth = maxDepth(root.right)
            return maxOf(leftDepth+rightDepth)+1
        }
    }
}