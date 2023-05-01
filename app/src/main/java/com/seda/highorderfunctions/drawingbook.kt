package com.seda.highorderfunctions

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val countFromStart :Int = p/2
    val countFromEnd :Int = n/2 - p/2
    return minOf(countFromStart,countFromEnd)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}