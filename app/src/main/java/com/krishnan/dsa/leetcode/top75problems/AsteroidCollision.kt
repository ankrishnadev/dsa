package com.krishnan.dsa.leetcode.top75problems

import java.util.Stack


fun main() {
    val asteroid = intArrayOf(-2, -1, 1, 2)
    println(asteroidCollision(asteroid))
}

private fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = Stack<Int>()

    for (asteroid in asteroids) {
        var shouldAdd = true

        while (stack.isNotEmpty() && asteroid < 0 && stack.peek() > 0) {
            if (stack.peek() < -asteroid) {
                stack.pop()
                continue
            } else if (stack.peek() == -asteroid) {
                stack.pop()
            }
            shouldAdd = false
            break
        }


        if (shouldAdd) {
            stack.push(asteroid)
        }
    }

    val result = IntArray(stack.size)
    for (i in result.indices.reversed()) {
        result[i] = stack.pop()
    }

    return result
}