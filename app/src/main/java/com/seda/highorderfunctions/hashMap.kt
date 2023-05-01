package com.seda.highorderfunctions

import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    //HashMap can also be initialize
    // with its initial capacity.
    //The capacity can be changed by
    // adding and replacing its element.
    val words = arrayOf("bats", "tabs", "in", "cat", "act")
    var map : HashMap<String,  MutableList<String>?>
            = HashMap()
    for (word in words) {
        val charArr = word.toCharArray()
        Arrays.sort(charArr)

        val sorted = String(charArr)
println("sorted:$sorted")
        if (map[sorted] != null) {

            val list = map[sorted]
            println("a:$list")
            println(map[sorted])
            list!!.add(word)
println("a1:$list")
            map[sorted] = list
            for(key in map.keys) {
           println("Element at key $key : ${map[key]}")
            }
        }
        else {
            val list: MutableList<String> = ArrayList()
            list.add(word)

            map[sorted] = list

        }
    }
    //adding elements to the hashMap using put() function

}