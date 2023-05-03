package com.seda.highorderfunctions

fun  hasDuplicates(arr: Array<Int>): Boolean {
    println(arr.size != arr.distinct().count())
    return arr.size != arr.distinct().count()
}

fun main() {
    val arr: Array<Int> = arrayOf(4, 6, 8, 3, 4)
    if (hasDuplicates(arr)) {
        println("Repeated elements found")
    }
    else {
        println("No repeated elements found")
    }
}