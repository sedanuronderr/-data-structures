package com.seda.highorderfunctions

import com.seda.highorderfunctions.binary.Companion.convertBinaryToDecimal
import kotlin.math.pow


class binary {

companion object {
    fun convertBinaryToDecimal(num: Long): Int {
        var num = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (num.toInt() != 0) {
            remainder = num % 10
            num /= 10
            decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
            ++i
        }
        return decimalNumber

    }
}

}
fun main(args: Array<String>) {
    val num = readLine()!!.toLong()

    val decimal =convertBinaryToDecimal(num)
    println(decimal )
}
