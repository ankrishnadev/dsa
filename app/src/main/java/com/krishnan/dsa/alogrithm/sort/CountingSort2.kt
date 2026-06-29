package com.krishnan.dsa.alogrithm.sort

fun main() {
    val input = arrayOf(1, 1, 3, 2, 1)
    val output = countingSort(input)
    println("Loop_Result_Final: ${output.joinToString { " " }}")

}

fun countingSort(arr: Array<Int>): Array<Int> {
    val count = IntArray(100)
    arr.forEach {
        println("Array each value: $it")
        count[it]++
        println("Array each value: ${count.joinToString { " " }}")
    }

    val result = Array(arr.size) { 0 }
    var index = 0

    for (i in count.indices) {
        repeat(count[i]) {
            println("Loop: $i")
            println("Loop_Result_Before: ${result.joinToString { " " }}")
            result[index++] = i
            println("Loop_Index: $index")
            println("Loop_Result_After: ${result.joinToString { " " }}")

        }
    }
    return result
}