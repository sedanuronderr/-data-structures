package com.seda.highorderfunctions

import java.util.*


fun main(args: Array<String>){

    println(Arrays.toString(ınsertionsort(arrayOf(4,5,8,1,9,2,15))))
}

   fun ınsertionsort(array: Array<Long>): Array<Long> {

    for(i in 1 until array.size) {
        var ilkdeger = i - 1
        println("j1  $ilkdeger")
        var ikincideger = array[i]

        while (ilkdeger >= 0 && ikincideger < array[ilkdeger]) {
            array[ilkdeger + 1] = array[ilkdeger]
         println("j  $ilkdeger")
            ilkdeger--

        }
        array[ilkdeger + 1] = ikincideger
    }

    return array

}
