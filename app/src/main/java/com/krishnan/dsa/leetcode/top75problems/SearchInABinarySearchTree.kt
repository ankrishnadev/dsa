package com.krishnan.dsa.leetcode.top75problems


fun main() {
    val root = TreeNode(4)
    root.left = TreeNode(2)
    root.right = TreeNode(7)
    root.left?.left = TreeNode(1)
    root.left?.right = TreeNode(3)

    searchBST(root, 2)
}

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    var node = root
    while (node != null) {
        if (node.`val` == `val`) {
            return node
        }

        node = if (node.`val` < `val`) {
            node.left
        } else {
            node.right
        }

    }

    return null
}