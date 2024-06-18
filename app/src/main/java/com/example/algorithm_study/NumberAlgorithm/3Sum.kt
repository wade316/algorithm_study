package com.example.algorithm_study.NumberAlgorithm

fun main() {
    val solution4 = Solution4()

    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val nums2 = intArrayOf(0, 1, 1)
    val nums3 = intArrayOf(0, 0, 0)



    println(solution4.threeSum(nums).joinToString())


}

class Solution4 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val map = hashMapOf<Int,Int>()
        val mutableList = mutableListOf<List<Int>>()
        val i = 0
        val j = 0
        var k = 0
        for ((i,v) in nums.withIndex()) {
            for (j in i+1..nums.size-1) {
                k = nums[i]-nums[j]-0
                if (i != j && j != k && i != k) {

                }
            }
        }
        return mutableList
    }

    fun result(arr: IntArray) {
        var count = 0
        var num = 0

        val map = mutableMapOf<Int, Int>()
        for ((i, k) in arr.withIndex()) {
            for (j in (i+1)..arr.size-1) {
                if (arr[i] == arr[j]){
                    num = arr[i]
                    count++
                }
                if (num != arr[j]){
//                    map.put()
                    count = 0
                }



                println("aaaa  $i, $j")
                println("$num, $count")
            }

        }


    }

}