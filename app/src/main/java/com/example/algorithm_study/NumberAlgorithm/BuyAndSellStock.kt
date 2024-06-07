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
        var max1 = 0
        var ind = 0
//        for (i in prices.indices){
//            for (j in i..prices.size-1) {
//                if (prices[i] < prices[j]) {
//                    if (prices[i] < prices[j] && min >= prices[i]) {
//                        min = prices[i]
//                    } else if (prices[i] > prices[j] && min >= prices[j]) {
//                        min = prices[j]
//                    }
//                    if (prices[i] < prices[j] && max1 <= prices[j]) {
//                        max1 = prices[j]
//                    }
//                }
//            }
//        }
//        return max1 - min

//        var minprice = prices[0]
//        var maxprice = 0
//        var result = 0
//
//        for (i in prices.indices) {
//            if (prices[i] < minprice) {
//                minprice = prices[i]
//                maxprice = prices[i]
//            }
//            if (prices[i] > maxprice) {
//                maxprice = prices[i]
//            }
//            result = max(maxprice - minprice, result)
//        }
//        return result

        for (i in prices.indices) {
            if (min > prices[i] && i > ind) {
                min = prices[i]
                max1 = prices[i]
                ind = i
                println("min, max, ind $min, $max1, $ind")
            }
            if (max1 < prices[i]) {
                max1 = prices[i]
                println("max $max1")
            }

        }
        return max1 - min
    }
}