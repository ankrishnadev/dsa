package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val products = arrayOf("mobile", "mouse", "moneypot", "monitor", "mousepad")
    val searchWord = "mouse"
    println(suggestedProducts(products, searchWord))
}

fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    products.sort()
    val result = mutableListOf<List<String>>()
    var prefix = ""

    for (char in searchWord) {
        prefix += char

        val startIndex = products.binarySearch(prefix)

        val index = if (startIndex >= 0) startIndex else -startIndex - 1

        val suggestions = mutableListOf<String>()
        for (i in index until index + 3) {
            if (i < products.size && products[i].startsWith(prefix)) {
                suggestions.add(products[i])
            }
        }
        result.add(suggestions)
    }

    return result
}