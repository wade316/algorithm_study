package com.example.algorithm_study.AlgorithmSort.InsertionSort

fun main() {
    val arr = intArrayOf(3, 2, 7, 5, 1, 9, 10, 8, 4, 6)

    insertionSort(arr)
}

fun insertionSort(arr: IntArray){
    for (i in 0..arr.lastIndex-1) {
        for (j in i+1 downTo 1) {
            if (arr[j] < arr[j-1]) {
                val temp = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = temp
            }
        }
    }
    println(arr.joinToString())
    for (i in arr.slice(2..5)){}
}