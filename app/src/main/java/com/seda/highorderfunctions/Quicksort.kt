package com.seda.highorderfunctions

import java.util.*

fun main(args: Array<String>){

    println((quicksort(listOf(4,5,8,1,9,2,15))))
}

fun quicksort(array: List<Long>): List<Long> {
    if (array.size < 2)
        return array

    val pivot = array[array.size/2]
    val equal = array.filter {
        it == pivot
    }
    val less = array.filter {
        it<pivot
    }
    val greater = array.filter {
        it >pivot
    }
    return quicksort(less) + equal + quicksort(greater)
}
