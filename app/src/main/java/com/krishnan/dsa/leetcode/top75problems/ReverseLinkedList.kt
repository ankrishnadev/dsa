package com.krishnan.dsa.leetcode.top75problems

fun main() {

}

class Node1(val `val`: Int) {
    var next: Node1? = null
}

private fun ReverseLinkedList(head: Node1): Node1? {

    var previous: Node1? = null
    var current = head.next

    while (current != null) {
        val nextTemp = current.next
        current.next = previous
        previous = current
        current = nextTemp
    }

    return previous
}