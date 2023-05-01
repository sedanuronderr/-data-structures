package com.seda.highorderfunctions

// Java program to convert binary to
// decimal when input is represented
// as binary string.


internal object GFG {
    // Function to convert binary to decimal
    fun binaryToDecimal(n: String): Int {
        var dec_value = 0

        // Initializing base value to 1,
        // i.e 2^0
        var base = 1
        val len = n.length
        for (i in len - 1 downTo 0) {
            if (n[i] == '1')
                dec_value += base
            base = base * 2
        }
        return dec_value
    }

    // Driver program to test above function
    @JvmStatic
    fun main(args: Array<String>) {
        val num: String = readLine().toString()
        println(binaryToDecimal(num))
    }
}


