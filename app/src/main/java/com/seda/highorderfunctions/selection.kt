package com.seda.highorderfunctions

import java.util.*

fun main(args: Array<String>){

    println(Arrays.toString(selectionsort(arrayOf(4,5,8,1,9,2,15))))
}

fun selectionsort(array:Array<Long>):Array<Long>{
    for( i in 0 until array.size){
        var index = i


        for(j in i until array.size){
            println("index kaç   "+j)
            println("index kaççç   "+i)
            if(array[j]< array[index]){
                println("index  "+array[index])
                println("j      "+array[j])
                index = j
            }

        }

        val smallnumber = array[index]
         array[index] = array[i]
        array[i]= smallnumber



    }


return array


}