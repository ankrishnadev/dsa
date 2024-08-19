package com.krishnan.dsa.leetcode.top75problems

class Node(val `val`: Int) {
    var next: Node? = null
}

private fun oddEvenLinkedList(node: Node?): Node? {

    if (node?.next == null) return node

    var odd = node
    var even = node
    val evenHead = even

    while (even?.next != null) {
        odd?.next = odd?.next?.next
        even.next = even.next?.next
        odd = odd?.next
        even = odd?.next
    }
    odd?.next = evenHead

    return node

}