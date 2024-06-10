package com.example.algorithm_study.NumberAlgorithm

import kotlin.math.max

fun main() {
    val solution2 = Solution2()
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val prices2 = intArrayOf(7, 6, 4, 3, 1)
    val prices3 = intArrayOf(2, 4, 1)

    println(solution2.maxProfit(prices))
    println(solution2.maxProfit(prices2))
    println(solution2.maxProfit(prices3))
}
class Solution2 {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var max = 0
        var result = 0

        for (i in prices.indices) {
            if (prices[i] < min) {
                min = prices[i]
                max = prices[i]
            }
            if (prices[i] > max) {
                max = prices[i]
            }
            result = max(max - min, result)
        }
        return result
    }
}