package com.example.algorithm_study.NumberAlgorithm

fun main() {
    val solution3 = Solution3()
    val num = intArrayOf(1,4,3,2)
    val num2 = intArrayOf(6,2,6,5,1,2)

    println(solution3.arrayPairSum(num))
    println(solution3.arrayPairSum(num2))
}
class Solution3 {
    fun arrayPairSum(nums: IntArray): Int {
        val num = nums.sortedArray()
        var res = 0
        for (i in 0..num.size-1 step 2) {
            if (num[i] > num[i+1]) {
                res += num[i+1]
            }else {
                res += num[i]
            }
        }
        return res
    }
}