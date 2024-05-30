package com.example.algorithm_study.Algorithm

fun main() {
    val solution = SolutionReverse()
    val chararr1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val chararr2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')

    solution.reverseString(chararr1)
    println(chararr1.joinToString())
    solution.reverseString(chararr2)
    println(chararr2.joinToString())
}

class SolutionReverse {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.size-1

        while (l < r) {
            val temp = s[l]
            s[l] = s[r]
            s[r] = temp

            l++
            r--
        }
    }
}