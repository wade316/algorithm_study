package com.example.algorithm_study.LinkedListAlgorithm

fun main() {
    val solution2 = Solution2()
    var li = ListNode(5)
    var v = li.`val`
    println(solution2.reverseList(li).toString())
}

//class ListNode1(var `val`: Int) {
//    var next: ListNode? = null
//}
class Solution2 {
    fun reverseList(head: ListNode?): ListNode? {
        var prev:  ListNode? = null
        var curr = head
        while(curr != null) {
            val nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        }
        return prev
    }
}