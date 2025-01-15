package com.krishnan.dsa.leetcode.top150problems

import kotlin.random.Random

fun main() {
    val randomizedSet = RandomizedSet()
    println(randomizedSet.insert(1))
    println(randomizedSet.remove(2))
    println(randomizedSet.insert(2))
    println(randomizedSet.getRandom())
    println(randomizedSet.remove(1))
    println(randomizedSet.insert(2))
    println(randomizedSet.getRandom())
}

private class RandomizedSet() {

    val nums = mutableListOf<Int>()
    val indexMap = mutableMapOf<Int, Int>()

    fun insert(`val`: Int) : Boolean {
        if (indexMap.containsKey(`val`)) {
            return false
        }
        nums.add(`val`)
        indexMap[`val`] = nums.size - 1
        return true
    }

    fun remove(`val`: Int) : Boolean {
        if (indexMap.containsKey(`val`).not()){
            return false
        }

        val index = indexMap[`val`]!!
        val lastVal = nums[nums.size - 1]
        nums[index] = lastVal

        nums.removeAt(nums.size - 1)
        indexMap.remove(`val`)

        return true
    }

    fun getRandom(): Int {
        return nums[Random.nextInt(nums.size)]
    }
}