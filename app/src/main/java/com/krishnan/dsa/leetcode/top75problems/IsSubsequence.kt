package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val source = "axc"
    val target = "ahbgdc"
    println(isSubsequence(source, target))
}

private fun isSubsequence(source: String, target: String): Boolean {
    var start = 0
    var end = 0
    while (start < source.length && end < target.length){
        if (source[start] == target[end]){
            start++
            end++
        } else {
            end++
        }
    }

    return start == source.length

}