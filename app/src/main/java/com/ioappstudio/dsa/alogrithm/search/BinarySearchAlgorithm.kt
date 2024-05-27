package com.ioappstudio.dsa.alogrithm.search

fun binarySearch(arrayInput: Array<Int>, target: Int): Int {

    var firstIndex = 0
    var lastPosition = arrayInput.size - 1
    while (firstIndex <= lastPosition) {
        val middleIndex = firstIndex + (lastPosition - firstIndex / 2)
        println("Middle: $middleIndex")

        if (arrayInput[middleIndex] == target) {
            return middleIndex
        }

        if (arrayInput[middleIndex] < target) {
            firstIndex = middleIndex + 1
        } else {
            lastPosition = middleIndex - 1
        }
        println("First position: $firstIndex")
        println("Last position: $lastPosition")

    }
    return -1
}