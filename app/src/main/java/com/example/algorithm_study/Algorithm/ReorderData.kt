package com.example.algorithm_study.Algorithm

fun main() {
    val solution3 = Solution3()
    val input = arrayOf("dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero")
    val input2 = arrayOf("a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo")

    println(solution3.reorderLogFiles(input).joinToString())
    println(solution3.reorderLogFiles(input2).joinToString())
}

class Solution3 {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        return logs.sortedWith(Comparator { o1, o2 ->
            val sub1 = o1.substringAfter(" ")
            val sub2 = o2.substringAfter(" ")

            when {
                sub1[0].isDigit() && sub2[0].isDigit() ->
                    return@Comparator 0
                sub1 == sub2 ->
                    return@Comparator o1.compareTo(o2)
                sub1[0].isDigit() && sub2[0].isLetter() ->
                    return@Comparator 1
                sub1[0].isLetter() && sub2[0].isDigit() ->
                    return@Comparator -1
                else -> return@Comparator sub1.compareTo(sub2)
            }
        }).toTypedArray()
    }
}