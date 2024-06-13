fun main() {
    val array = arrayOf(14, 55, 3, 2, 45, 14)
    sortArrayAsAscendingOder(array)
}

fun sortArrayAsAscendingOder(nums1: Array<Int>) {

    val n = nums1.size
    var temp: Int

    for (i in 0 until n - 1) {
        var checkIndex = i

        for (j in i + 1 until n) {
            if (nums1[j] > nums1[checkIndex]) {
                checkIndex = j
            }
        }

        if (checkIndex != i) {
            temp = nums1[i]
            nums1[i] = nums1[checkIndex]
            nums1[checkIndex] = temp
        }
    }

    println(nums1.toList())

}