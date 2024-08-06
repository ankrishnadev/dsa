package com.krishnan.dsa.leetcode.top75problems


fun main() {
    val arrOne = intArrayOf(1,2,3)
    val arrTwo = intArrayOf(2,4,6)
    println(findDifference(arrOne, arrTwo))
}

private fun findDifferentTwoArray(arrOne: IntArray, arrTwo: IntArray): List<List<Int>> {
    val result: MutableList<List<Int>> = mutableListOf()
    result.add(arrOne.toSet().subtract(arrTwo.toSet()).toList())
    result.add(arrTwo.toSet().subtract(arrOne.toSet()).toList())
    println(result)
    return result.toList()
}

//Less complexity
private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val s1 = convert(nums1)
    val s2 = convert(nums2)

    val ans: MutableList<List<Int>> = ArrayList()
    val l1: MutableList<Int> = ArrayList()
    val l2: MutableList<Int> = ArrayList()
    for (v in s1) {
        if (!s2.contains(v)) {
            l1.add(v)
        }
    }
    for (v in s2) {
        if (!s1.contains(v)) {
            l2.add(v)
        }
    }
    ans.add(l1)
    ans.add(l2)
    return ans
}

private fun convert(nums: IntArray): Set<Int> {
    val s: MutableSet<Int> = HashSet()
    for (v in nums) {
        s.add(v)
    }
    return s
}
