package com.seda.highorderfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var myInt:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = myInt?.plus(1)

         myInt.let {
              val num = it?.plus(1)
         }

        val myNum = myInt?.let {
            it + 1
        }?:0

        //also şu da  bunu da
val atil =Person1("seda",23)
 val emir =Person1("emir",20)
     val people = listOf<Person1>(atil,emir)
people.filter { it.age > 18 }.also {
    for (person in it){
        println(person.name)
    }
}
        //apply objeleri modife etcez çok uğraşmıcaz.obje referans


  //with  argüman  geri bir şey döndürmüyor

        Person1("barley",4).apply {
            name ="Barley"
        }.also { it.name }


val newBarley = Person1("bar",3).apply {
    name="Barley"
}
        val another= Person1("bae",3)
   with(another){
       name ="Bar"
       age=3
   }
    }
}

data class Person1(var name:String,var age:Int)