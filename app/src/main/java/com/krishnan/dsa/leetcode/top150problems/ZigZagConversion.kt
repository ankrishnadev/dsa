package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val string = "PAYPALISHIRING"
    val rowSize = 3
    println(convert(string, rowSize))
}

fun convert(s: String, numRows: Int): String {

    var index = 0
    var step = 1
    val rows = MutableList(numRows) {
        StringBuilder()
    }

    for(char in s){
        rows[index].append(char)
        if(index == 0){
            step = 1
        } else if(index == numRows - 1){
            step = -1
        }
        index += step
    }
    return rows.joinToString("")
}