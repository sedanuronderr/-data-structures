package com.seda.highorderfunctions

import java.util.*
import kotlin.collections.ArrayList


fun countSentences(words: Array<String>, sentences: Array<String>) {
    val words = arrayOf("bats", "tabs", "in", "cat", "act")
   val sentences = arrayOf("cat the bats", "in the act", "act tabs in")
    val count = IntArray(sentences.size)
    val map: HashMap<String, MutableList<String>?> = HashMap()
    val mapToUse: HashMap<String, List<String>?> = HashMap()
    for (word in words) {
        val charArr = word.toCharArray()
        Arrays.sort(charArr)
        val sorted = String(charArr)
        if (map[sorted] != null) {
            val list = map[sorted]
            list!!.add(word)
            map[sorted] = list
            mapToUse[word] = list
        } else {
            val list: MutableList<String> = ArrayList()
            list.add(word)
            map[sorted] = list
            mapToUse[word] = list
        }
    }
    var index = 0
    for (sentence in sentences) {
        var c = 1
        val strArr = sentence.trim { it <= ' ' }.split(" ").toTypedArray()
        for (str in strArr) {
            if (mapToUse[str] != null) {
                val list = mapToUse[str]
                c = c * list!!.size
            }
        }
        count[index++] = c
    }
    for (i in count.indices) {
        println(count[i].toString() + " ")
    }
}


fun main(){
    val wordSetCount = readLine()!!.trim().toInt()

    val wordSet = Array<String>(wordSetCount, { "" })
    for (i in 0 until wordSetCount) {
        val wordSetItem = readLine()!!
        wordSet[i] = wordSetItem
    }

    val sentencesCount = readLine()!!.trim().toInt()

    val sentences = Array<String>(sentencesCount, { "" })
    for (i in 0 until sentencesCount) {
        val sentencesItem = readLine()!!
        sentences[i] = sentencesItem
    }

    val result = countSentences(wordSet, sentences)

    println(result)
}
