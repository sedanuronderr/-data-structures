package com.seda.highorderfunctions

fun singleNumber(nums: Array<Int>): Int {

    var list = mutableListOf<Int>()
    println(list)
    nums.forEach {
        println(it)
        if(list.contains(it)){

            list.remove(it)
        }
        else{
            list.add(it)
        }
    }
    println(list[0])
return  list[0]
}


fun main() {
    val arr: Array<Int> = arrayOf(2,2,1)
    singleNumber(arr)
}