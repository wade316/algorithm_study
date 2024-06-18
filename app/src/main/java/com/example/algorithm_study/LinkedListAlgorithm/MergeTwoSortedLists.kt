package com.example.algorithm_study.LinkedListAlgorithm

fun main() {
    val list1 = ListNode(4)
    val list2 = ListNode(4)
    val solution3 = Solution3()
    val mergedList = solution3.mergeTwoLists(list1, list2)

    println(solution3.mergeTwoLists(list1, list2))
}

class Solution3 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            return list2
        }
    }
}