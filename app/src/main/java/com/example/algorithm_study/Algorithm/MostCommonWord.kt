package com.example.algorithm_study.Algorithm

fun main() {
    val solution4 = Solution4()
    val input = "Bob hit a ball, the hit BALL flew far after it was hit."
    val input2 = "a."
    val banned = arrayOf("hit")
    val banned2 = arrayOf("")

    println(solution4.mostCommonWord(input, banned))
    println(solution4.mostCommonWord(input2, banned2))

}

class Solution4 {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val para = paragraph.split(" ", ",")
        val para2 = paragraph.split("[^a-zA-Z0-9\n]".toRegex())
        val para2 = paragraph.split("".toRegex())

        val paraList = ""
//        for (i in para.indices) {
//            if (i)
//        }
        println(para)
        println(para2)
        return para.joinToString()
    }
}