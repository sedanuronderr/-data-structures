package com.seda.highorderfunctions

fun majorityElement(nums: Array<Int>):Int {
    var count = 0
    var candidate: Int = 0
    nums.forEach { num ->
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }
    return candidate


}

fun main() {
    val arr: Array<Int> = arrayOf(2,2,1,1,1)
 majorityElement(arr)
}