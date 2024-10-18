package com.krishnan.dsa.leetcode.top75problems

fun main() {
    println(combinationSum3(3, 7))
}

fun combinationSum3(k: Int, n: Int): List<List<Int>> {
    var result = mutableListOf<List<Int>>()
    backTracking(1, k, n, mutableListOf(), result)
    return result
}

fun backTracking(
    start: Int,
    k: Int,
    n: Int,
    path: MutableList<Int>,
    result: MutableList<List<Int>>
) {

    if (path.size == k && n == 0) {
        result.add(ArrayList(path))
        return
    }

    if (path.size == k || n < 0) {
        return
    }

    for (i in start..9) {
        path.add(i)
        backTracking(i + 1, k, n - i, path, result)
        path.removeAt(path.lastIndex)
    }
}