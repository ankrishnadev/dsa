package com.krishnan.dsa.leetcode.top75problems

fun main() {
    val trie = Trie()
    trie.insert("apple")

    println(trie.search("apple"))
    println(trie.search("app"))
    println(trie.startsWith("app"))

    trie.insert("app")
    println(trie.search("app"))
}

class TrieNode {
    val children = HashMap<Char, TrieNode>()
    var isEndOfWord: Boolean = false
}

class Trie {
    private val rootTrie = TrieNode()

    fun insert(word: String) {
        var node = rootTrie
        for (char in word) {
            if (!node.children.containsKey(char)) {
                node.children[char] = TrieNode()
            }
            node = node.children[char]!!
        }
        node.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        var node = rootTrie
        for (char in word) {
            if (!node.children.containsKey(char)) {
                return false
            }
            node = node.children[char]!!
        }
        return node.isEndOfWord
    }

    fun startsWith(prefix: String): Boolean {
        var node = rootTrie
        for (char in prefix) {
            if (!node.children.containsKey(char)) {
                return false
            }
            node = node.children[char]!!
        }
        return true
    }
}

