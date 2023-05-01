package com.seda.highorderfunctions

import java.util.*

fun main(args: Array<String>){

    println(Arrays.toString(bubblesort(arrayOf(4,5,8,1,9,2,15))))
}

fun bubblesort(array: Array<Long>): Array<Long>? {
    var temp:Long
    for(i in array.indices){
        for(j in 0 until array.size-1-i){

            if(array[j] > array[j+1]){
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }

    }

return array

}
