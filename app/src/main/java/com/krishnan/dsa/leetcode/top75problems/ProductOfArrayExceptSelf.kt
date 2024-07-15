package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val array = intArrayOf(-1, 1, 0, -3, 3)
    productExceptSelf(array)
}

private fun productOfArrayExceptSelf(nums: IntArray) {

    val result = IntArray(nums.size)
    val left = IntArray(nums.size)
    val right = IntArray(nums.size)

    left[0] = 1
    for (i in 1 until nums.size) {
        left[i] = left[i - 1] * nums[i - 1]
    }

    right[nums.size - 1] = 1
    for (i in nums.size - 2 downTo 0) {
        right[i] = right[i + 1] * nums[i + 1]
    }

    for (i in nums.indices) {
        result[i] = left[i] * right[i]
    }

    println(left.toList())
    println(right.toList())
    println(result.toList())

}

//Approach 2
fun productExceptSelf(nums: IntArray): IntArray {
    val totalProduct = IntArray(nums.size) { 1 }

    var currentProduct = 1
    for ((index, num) in nums.withIndex()) {
        currentProduct *= num
        if (index < nums.size - 1) totalProduct[index + 1] = currentProduct
    }

    currentProduct = 1
    for ((index, num) in nums.withIndex().reversed()) {
        currentProduct *= num
        if (index > 0) totalProduct[index - 1] *= currentProduct
    }
    println(totalProduct.toList())

    return totalProduct
}

