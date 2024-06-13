package com.krishnan.dsa.leetcode.top150problems

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 24, 44, 22)
    val nums2 = intArrayOf(2, 5, 6)
    println(mergeSortedArray(nums1, 3, nums2, 3))

}

fun mergeSortedArray(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var first = m - 1
    var last = n - 1
    var middle = m + n - 1

    while (first >= 0 && last >= 0) {
        if (nums1[first] >= nums2[last]) {
            nums1[middle--] = nums1[first--]
        } else {
            nums1[middle--] = nums2[last--]
        }
    }

    System.arraycopy(nums2, 0, nums1, 0, last + 1)
}
