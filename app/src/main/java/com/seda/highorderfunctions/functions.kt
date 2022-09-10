package com.seda.highorderfunctions

import kotlin.math.abs

fun main(){
val name1 ="seda"
    val name2 ="onder"
  val person=Person("seda","onder",23)
  val  person1 =Person("emir","olcok",20)
    println(getAgeDifference(person,person1))
println(person getAgeDifferenceFrom(person1))
 // println(twoName(name1, name2))

 val number1= 18
 val number2 =2

val resultnumber = doMathOPeration(number1,number2,::number)
//println(resultnumber)


 runOnlyIfAge(number1){
   //  println("older than 10")
 }

val numbers =IntArray(5){
    it+1
}
    for(number in numbers){
        println(number)
    }
println(numbers.getmiddle())
}

fun twoName(name1:String,name2:String):String{
   return name1 + name2
}

fun number (number1:Int,number2: Int)=number1 +number2
//Higher Order Functions
inline fun doMathOPeration(number1:Int,number2:Int,function:(Int,Int)->Int)= function(number1,number2)
// array gibi durumlarda döngü oluştuğunda nesne oluşur uygulama yavaşlar
//inline kullanıldığında nesne arkaplanda oluşmaz.farklı nesne üretmeyi engeller
//noinline nesne üretmeye başlar
//crossinline

fun runOnlyIfAge(age:Int,block:()->Unit){
    if(age>10){
        block()
    }
}

fun getAgeDifference(person: Person,person1:Person)= abs(person.age-person1.age)

//Extension functions
infix fun Person.getAgeDifferenceFrom(person: Person):Int{
    return abs(age - person.age)
}

fun IntArray.getmiddle() = this[(0+size)/2]