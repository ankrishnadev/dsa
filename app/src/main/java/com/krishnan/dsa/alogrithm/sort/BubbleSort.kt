package com.krishnan.dsa.alogrithm.sort

fun main() {
    val arr = intArrayOf(1, 4, 67, 88, 42, 3, 5)

    val result = bubbleSort(arr)
    println(result.toList())

    val result1 = bubbleSort1(arr)
    println(result1.toList())
}

//Type 1
fun bubbleSort(arr: IntArray): IntArray {
    var swapped: Boolean
    var temp: Int
    val n = arr.size

    for (i in 0 until n - 1) {
        swapped = false
        //println("1nd Loop: $i")
        for (j in 0 until n - i - 1) {
            //println("2nd Loop: $j")
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }

        if (!swapped) break
    }
    return arr
}

//Type 2
fun bubbleSort1(arr: IntArray): IntArray {
    val n = arr.size

    for (i in 0 until n - 1) {

        //println("1nd Loop: $i")
        for (j in 0 until n - i - 1) {
            //println("2nd Loop: $j")
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

            }
        }
    }
    return arr
}