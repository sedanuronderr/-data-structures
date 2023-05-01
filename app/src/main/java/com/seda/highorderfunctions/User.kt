package com.seda.highorderfunctions

class User(val name:String,val age:Int) {
    val user1 =User("Ali",25)
    val user2 =User("Ali",25)

    fun main(){
        print(user1 == user2)
    }
}


