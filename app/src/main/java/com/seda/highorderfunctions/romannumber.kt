package com.seda.highorderfunctions


object  romannumber {
    fun romanToInt(s: String): Int {
        val romanNumerals = mapOf('I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)

        var result = 0

        for(i in s.indices){
            val currValue = romanNumerals.getValue(s[i])
            println("currvalue= $currValue")
            if (i + 1 != s.length) {
                val nextValue = romanNumerals.getValue(s[i + 1])
                println("nextvalue= $nextValue")
                if ( currValue < nextValue) {
                    result -= currValue

                } else {
                    result += currValue
                    println("result= $result")
                }



            } else {
                result += currValue
            }

        }
        return result
    }
}
fun main(){
    romannumber.romanToInt("LVIII")
}