package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    val result = dailyTemperatures(temperatures)
    println(result.joinToString(", "))
}

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val n = temperatures.size
    val answer = IntArray(n) { 0 }
    val stack = mutableListOf<Int>()

    for (i in temperatures.indices) {

        while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
            val prevIndex = stack.removeAt(stack.size - 1)
            answer[prevIndex] = i - prevIndex
        }

        stack.add(i)
    }

    return answer
}