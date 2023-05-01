package com.seda.highorderfunctions

object  twosum {

    fun twoSum(nums: Array<Int>, target: Int) {
        val lise = mutableListOf<Int>()
        for (n in 0..nums.size){
            for(k in n + 1 until nums.size) {
                if(nums[n] + nums[k] == target){
                    lise.add(n)
                    lise.add(k)
                }
            }
        }
        println(lise)

    }


}
fun main(){
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    var age : Int = readLine()!!.toInt()
    val list = listOf(2,7,11,15)
    twosum.twoSum(ar,age)

}