package com.seda.highorderfunctions

fun main(){
    //filter
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

  val smallList=  myNumList.filter { num-> num <6 }

    for(num in smallList){
        println(num)
    }

    //map

  val carp=  myNumList.map { it*3 }

    for(islem in carp){
        println(islem)
    }

    val filterAndMapCombined = myNumList.filter { it<6 }.map { it*3 }

    for(islem in filterAndMapCombined){
        println(islem)
    }
    val person = listOf<Person>(
    Person("seda","onder",23),
    Person("emir","olçok",20)
    )
    val filter = person.filter { it->it.age<21 }.map { it ->it.surname }
    for(islem in filter){
        println(islem)
    }
}
