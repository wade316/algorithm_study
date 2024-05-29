package com.example.algorithm_study.AlgorithmSort.SelectionSort

fun main() {
    val arr = intArrayOf(3, 2, 7, 5, 1, 9, 10, 8, 4, 6)

    selectionSort(arr)
}

fun selectionSort(arr: IntArray){
    var min_idx = 0
    for (i in 0..arr.lastIndex) {
        min_idx = i

        for (j in i + 1..arr.lastIndex) {
            if (arr[j] < arr[min_idx]) min_idx = j
        }
        val term = arr[i]
        arr[i] = arr[min_idx]
        arr[min_idx] = term
    }
    println(arr.joinToString())
}
