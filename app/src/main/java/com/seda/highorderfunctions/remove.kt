package com.seda.highorderfunctions

fun findCount(s: String?, t: String?): Int {
    var s = s
    if (null == s || "" === s || null == t || "" === t) return 0
    var count = 0

    while (true) {
      s=  if (s!!.contains(t)) {
            count++
            val i = s.indexOf(t)
            println("i:$i")
           s.substring(0, i) + s.substring(i + t.length,s.length)
          // s.replace(t,"");
        } else break
        println("s:${s}")
    }
    return count
}
fun main(){
    val seq = readLine()!!

    val result = findCount(seq,"AB")

    println(result)
}