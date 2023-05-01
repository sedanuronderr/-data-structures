package com.seda.highorderfunctions


internal class Solution {
    var liste = mutableListOf<Int>()
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] = nums[i]+ nums[i - 1]

        }
for (n in nums){
  liste.add(n)


}
        println(liste)
        return nums
    }
}
fun main(){
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toIntArray()

    Solution().runningSum(ar)
}