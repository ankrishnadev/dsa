package com.krishnan.dsa.leetcode.top75problems


fun main() {
    val input = listOf(1, 3, 4, 7, 1, 2, 6)
    //println(deleteMiddleNode(input))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

private fun deleteMiddleNode(head: ListNode): ListNode? {

    if (head.next == null) return null
    var slow: ListNode? = head
    var fast: ListNode? = head
    while (fast?.next != null) {
        slow = slow!!.next
        fast = fast.next?.next
    }
    fast = head
    while (true) {
        if (fast!!.next == slow) {
            fast.next = fast.next?.next
            break
        }
        fast = fast.next
    }

    return head
}