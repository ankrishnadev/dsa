package com.krishnan.dsa.leetcode.top75problems

fun main() {

}

class NodeNext(val `val`: Int) {
    var next: NodeNext? = null
}

private fun maxTwoSum(head: NodeNext?): Int {
    // Find middle point
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    // Reverse order
    var prev: NodeNext? = null
    var current = slow
    while (current != null) {
        val nextTemp = current?.next
        current?.next = prev
        prev = current
        current = nextTemp
    }

    // Find sum for two array
    var maxSum = 0
    var firstHalf = head
    var secondHalf = prev

    while (secondHalf != null) {
        maxSum = maxOf(maxSum, (firstHalf?.`val` ?: 0) + (secondHalf.`val`))
        firstHalf = firstHalf?.next
        secondHalf = secondHalf.next
    }

    return maxSum
}