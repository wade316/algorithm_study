package com.example.algorithm_study.NumberAlgorithm

fun main() {
    val solution5 = Solution5()
    val arr = intArrayOf(1,2,3,4)
    val arr2 = intArrayOf(-1,1,0,-3,3)

    println(solution5.productExceptSelf(arr).joinToString())
    println(solution5.productExceptSelf(arr2).joinToString())
}

class Solution5 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in nums.indices) {
            val filterList = nums.filterIndexed { index, _ -> index != i }
            list.add(filterList.reduce { acc, value -> acc * value })
        }
        return list.toIntArray()
    }
}