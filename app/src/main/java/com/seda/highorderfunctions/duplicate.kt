package com.seda.highorderfunctions

fun <Int> hasDuplicates(arr: Array<Int>): Boolean {
    arr.sort()    // sort the array

    var previous: Int? = null

    for (e in arr)
    {
        if (e != null && e == previous) {
            return true
        }
        previous = e
    }
    return false    // no repeated elements
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