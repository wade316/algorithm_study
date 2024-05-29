package com.example.algorithm_study.Algorithm

fun main() {
    val solution = Solution()

    println(solution.isPalindrome("A man, a plan, a canal: Panama"))
    println(solution.isPalindrome("race a car"))
    println(solution.isPalindrome(" "))
}

class Solution {
    fun isPalindrome(s: String): Boolean {
        val result = s.filter{ it.isLetterOrDigit()}.toLowerCase()
        if (result == result.reversed()) return true else return false
    }
}