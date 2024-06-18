package com.example.algorithm_study.Test

fun main() {
    val test = Test()
    val testarr1 = intArrayOf(1, 2, 3, 3, 3, 3, 4, 4)
    val testarr2 = intArrayOf(3, 2, 4, 4, 2, 5, 2, 5, 5)
    val testarr3 = intArrayOf(3, 5, 7, 9, 1)

    println(test.test(testarr1).joinToString())
    println(test.test(testarr2).joinToString())
    println(test.test(testarr3).joinToString())
}

class Test {
    fun test(arr1: IntArray): IntArray {
        val n = arr1.groupBy { it }.mapValues { it.value.size }
        val a = mutableListOf<Int>()
        for ((k, v) in n) {
            if (v > 1) {
                a.add(v)
            }
        }
        if (a.isEmpty()) {
            a.add(-1)
        }
        return a.toIntArray()
    }
}