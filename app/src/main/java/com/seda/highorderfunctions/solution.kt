package com.seda.highorderfunctions


fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val result: Boolean
    val listRansomNote = mutableListOf<Char>()
    ransomNote.forEach { listRansomNote.add(it) }
    for (i in magazine) {
        if (i in listRansomNote) {
            listRansomNote.remove(i)
        }
    }
    if (listRansomNote.isEmpty()) result = true else result = false
    return result
}

fun main(){
    canConstruct("aa","aab")
}