package com.krishnan.dsa.leetcode.top75problems

fun main() {

    val equations = listOf(listOf("a", "b"), listOf("b", "c"))
    val values = doubleArrayOf(2.0, 3.0)
    val queries = listOf(
        listOf("a", "c"),
        listOf("b", "a"),
        listOf("a", "e"),
        listOf("a", "a"),
        listOf("x", "x")
    )

    val result = calcEquation(equations, values, queries)
    println(result.joinToString(", "))  // Output: [6.0, 0.5, -1.0, 1.0, -1.0]
}

fun calcEquation(
    equations: List<List<String>>,
    values: DoubleArray,
    queries: List<List<String>>
): DoubleArray {

    val graph = mutableMapOf<String, MutableMap<String, Double>>()
    for ((i, equation) in equations.withIndex()) {
        val a = equation[0]
        val b = equation[1]
        val value = values[i]

        graph.putIfAbsent(a, mutableMapOf())
        graph.putIfAbsent(b, mutableMapOf())

        graph[a]!![b] = value
        graph[b]!![a] = 1.0 / value

    }


    fun dfs(start: String, end: String, visited: MutableSet<String>): Double {

        if (start !in graph || end !in graph) return -1.0
        if (start == end) return 1.0
        visited.add(start)

        for ((nearest, value) in graph[start]!!) {
            if (nearest !in visited) {
                val result = dfs(nearest, end, visited)
                if (result != -1.0) return value * result
            }
        }

        return -1.0
    }

    val result = DoubleArray(queries.size)

    for ((i, query) in queries.withIndex()) {
        val (a, b) = query
        result[i] = dfs(a, b, mutableSetOf())
    }

    return result
}