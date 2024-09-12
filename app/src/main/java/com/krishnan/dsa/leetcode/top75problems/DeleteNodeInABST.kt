package com.krishnan.dsa.leetcode.top75problems

fun deleteNode(root: TreeNode?, key: Int): TreeNode? {

    if (root == null) return null

    when {
        key < root.`val` -> root.left = deleteNode(root.left, key)
        key > root.`val` -> root.right = deleteNode(root.right, key)
        else -> {
            if (root.left == null) return root.right
            if (root.right == null) return root.left

            val result = inOrderNode(root.right)
            root.`val` = result?.`val`!!
            root.right = deleteNode(root.right, result.`val`)
        }
    }

    return root

}

private fun inOrderNode(node: TreeNode?): TreeNode? {
    var currentNode = node
    while (currentNode?.left != null) {
        currentNode = currentNode.left
    }

    return currentNode
}