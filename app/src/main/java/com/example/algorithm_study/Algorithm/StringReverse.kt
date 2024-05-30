package com.example.algorithm_study.Algorithm

fun main() {
    val case1 = SolutionReverse1()
    val case2 = SolutionReverse2()
    val case3 = SolutionReverse3()
    val case4 = SolutionReverse4()
    val chararr1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val chararr2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')

    case1.reverseString(chararr1)
    println("case1.1 ${chararr1.joinToString()}")
    case1.reverseString(chararr2)
    println("case1.2 ${chararr2.joinToString()}")
    case2.reverseString(chararr1)
    println("case2.1 ${chararr1.joinToString()}")
    case2.reverseString(chararr2)
    println("case2.2 ${chararr2.joinToString()}")
    case3.reverseString(chararr1)
    println("case3.1 ${chararr1.joinToString()}")
    case3.reverseString(chararr2)
    println("case3.2 ${chararr2.joinToString()}")
    case4.reverseString(chararr1)
    println("case4.1 ${chararr1.joinToString()}")
    case4.reverseString(chararr2)
    println("case4.2 ${chararr2.joinToString()}")
}

class SolutionReverse1 {
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

class SolutionReverse2 {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.size-1

        for (i in l until s.size / 2){
            val temp = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = temp
        }
    }

}class SolutionReverse3 {
    fun reverseString(s: CharArray): Unit {
        val reversedArray = s.reversedArray()
        for (i in s.indices) {
            s[i] = reversedArray[i]
        }
    }
}

class SolutionReverse4 {
    fun reverseString(s: CharArray): Unit {
        var i = 0
        var j = s.size - 1

        while (i < j) {
            s[i] = s[j].also { s[j] = s[i] }
            i++
            j--
        }
    }
}