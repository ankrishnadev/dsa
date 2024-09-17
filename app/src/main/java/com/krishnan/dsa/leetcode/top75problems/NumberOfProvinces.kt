package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val provinces = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))
    println(findCircleNum(provinces))
}

fun findCircleNum(isConnected: Array<IntArray>): Int {

    val visitedCities = BooleanArray(isConnected.size) { false }
    var provinceCount = 0

    for (i in isConnected.indices) {
        if (visitedCities[i].not()) {
            dfs(isConnected, visitedCities, i)
            provinceCount++
        }
    }
    return provinceCount
}

fun dfs(isConnected: Array<IntArray>, visitedCities: BooleanArray, i: Int) {
    visitedCities[i] = true

    for (j in isConnected.indices) {
        if (isConnected[i][j] == 1 && visitedCities[j].not()) {
            dfs(isConnected, visitedCities, j)
        }
    }
}
