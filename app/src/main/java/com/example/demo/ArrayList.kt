package com.example.demo

fun main(args:Array<String>){
    var arrylist = arrayListOf<String>()
    arrylist.add(1,"Abebe")
    arrylist.add(2,"kemal")
    arrylist.add(3,"Tadese")

  //  arrylist.forEach{  print("${arrylist.get(0)}") }
    for(i in arrylist.indices ) print("$i ")
    println(" ")
}