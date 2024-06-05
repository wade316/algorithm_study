package com.example.algorithm_study.NumberAlgorithm

fun main() {
    val solution = Solution()

    val nums = intArrayOf(2, 7, 11, 15)
    val nums2 = intArrayOf(3, 2, 4)
    val nums3 = intArrayOf(3, 3)
    val target = 9
    val target2 = 6
    val target3 = 6

    println(solution.twoSum(nums, target).joinToString())
    println(solution.twoSum(nums2, target2).joinToString())
    println(solution.twoSum(nums3, target3).joinToString())
}
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in (i +1) until  nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i,j)
                }
            }
        }
        return nums
    }

//    fun twoSum2(nums: IntArray, target: Int): IntArray {
//        var ind1 = 0
//        var ind2 = 0
//        var arr = intArrayOf()
//        for ((index, value) in nums.withIndex()) {
//            for ((index2, value2) in nums.withIndex()) {
//
//            }
//        }
//        return nums
//    }
}