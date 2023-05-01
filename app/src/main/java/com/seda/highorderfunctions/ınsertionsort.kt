package com.seda.highorderfunctions

import java.util.*


fun main(args: Array<String>){

    println(Arrays.toString(ınsertionsort(arrayOf(4,5,8,1,9,2,15))))
}

fun ınsertionsort(array: Array<Long>): Array<Long> {

    for(i in 1 until array.size) {
        var j = i - 1
        var key = array[i]
        while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j]
         println("j"+j)
            j--
        }
        array[j + 1] = key
    }

    return array

}
