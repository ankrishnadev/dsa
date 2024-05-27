package com.ioappstudio.dsa

val binaryInputArray = arrayOf(2, 5, 6, 7, 78, 44, 33, 65)
fun main() {
    //println("Count Digits: ${findCountDigits(156640)}")
    //println("FindTheFirstDigit: ${findTheFirstDigit(6156640)}")
    //println("FindTheLastDigits: ${findTheLastDigits(615664)}")
    //println("FindTheLastDigits1: ${findCountDigits2(6664)}")
    println("BinarySearch: ${binarySearch(binaryInputArray, 5)}")
    println("BinarySearch: ${binarySearchWithForLoop(binaryInputArray, 7)}")

}

fun findTheFirstDigit(input: Int): Int {
    var inputValue = input
    while (inputValue >= 10) {
        inputValue /= 10
    }
    return inputValue
}

fun findTheLastDigits(input: Int): Int {
    return (input % 10)
}

fun findCountDigits(value: Int): Int {
    var count = 0
    var input = value
    while (input != 0) {
        input /= 10
        ++count
    }
    return count
}

//Different approach
fun findCountDigits2(value: Int): Int {
    if (value / 10 == 0) return 1
    return 1 + findCountDigits2(value / 10)
}

fun binarySearch(arrayInput: Array<Int>, target: Int): Int {

    var firstIndex = 0
    var lastPosition = arrayInput.size - 1
    println("------------------ Binary Search with While Loop----------------")
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

fun binarySearchWithForLoop(arrayInput: Array<Int>, target: Int): Int {
    println("------------------ Binary Search with For Loop----------------")
    for (item in 0..arrayInput.size) {
        if (item == target) {
            return item
            break
        }
        println("Iterate: ${arrayInput[item]}")
    }
    return -1
}