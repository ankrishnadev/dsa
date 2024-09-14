package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val rooms = listOf(listOf(1), listOf(2), listOf(3), listOf())
    println(canVisitAllRooms(rooms))
}

fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {

    val visited = mutableSetOf<Int>()

    fun dfs(room: Int) {
        if (room in visited) return
        visited += room
        for (key in rooms[room]) dfs(key)
    }

    dfs(0)

    return visited.size == rooms.size
}