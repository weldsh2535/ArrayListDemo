package com.example.demo

fun main(args:Array<String>){
    /*print("welcome to kotiln")*/
    val list = arrayOf(1,2,3,4,5,6)
    for(i in list ) print("$i ")
    println(" ")
    val listStr = mutableListOf<String>("Abebe","Kebede","Lema","tatek","Tenesa","Kebede")
    print("Array of size == ${listStr.size}")
    println(" ")
    if(listStr.contains("Abebe")){
        print("yes")
    }else{
        print("Not found")
    }
    println(" ")

    //get
    print(listStr.get(0))

    //set methode
    listStr.set(0,"Alem")
    println(" ")
    for(i in listStr ) print("$i ")
    println(" ")

    //foreach
    listStr.forEach {  print("$it  ") }
    println(" ")

    for(i in 1..10 step 2 ) print("$i ")
    println(" ")
    for(i in 1 until 10  ) print("$i ")
    println("")
    for(i in 10 downTo 2 step 2 ) print("$i ")
    println("")
    var name:String? = "Abebe"
    name = null
    name?.let{print(name.length)}
}