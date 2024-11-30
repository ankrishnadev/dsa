package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val spanner = StockSpanner()

    println(spanner.next(100)) // Output: 1
    println(spanner.next(80))  // Output: 1
    println(spanner.next(60))  // Output: 1
    println(spanner.next(70))  // Output: 2
    println(spanner.next(60))  // Output: 1
    println(spanner.next(75))  // Output: 4
    println(spanner.next(85))  // Output: 6
}

class StockSpanner() {
    private val stack = mutableListOf<Pair<Int, Int>>()
    fun next(price: Int): Int {
        var span = 1
        while (stack.isNotEmpty() && stack.last().first <= price) {
            span += stack.removeAt(stack.size - 1).second
        }
        stack.add(Pair(price, span))
        return span
    }
}