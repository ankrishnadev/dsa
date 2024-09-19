package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val n = 6
    val connections = listOf(
        listOf(0, 1),
        listOf(1, 3),
        listOf(2, 3),
        listOf(4, 0),
        listOf(4, 5)
    )

    println(minReorder(n, connections))
}

fun minReorder(n: Int, connections: List<List<Int>>): Int {
    var leastRoute = 0
    val graph = mutableMapOf<Int, MutableList<Pair<Int, Int>>>()

    for (connection in connections) {
        val (a, b) = connection
        graph.computeIfAbsent(a) { mutableListOf() }.add(Pair(b, 1))
        graph.computeIfAbsent(b) { mutableListOf() }.add(Pair(a, 0))
    }

    val visited = BooleanArray(n) { false }

    fun dfs(node: Int) {
        visited[node] = true
        for ((nearest, reOrder) in graph.getOrDefault(node, mutableListOf())) {
            if (visited[nearest].not()) {
                leastRoute += reOrder
                dfs(nearest)
            }
        }
    }

    dfs(0)

    return leastRoute
}