package com.scienstechnologies.kotlinapplication

fun main(args : Array<String>){
    var myArray = Array<Int>(5){0}
    val integer = arrayOf(10,20)
    var names = arrayOf("mamatha","Lokesh","Venkatesh","Kiran")
    var stringvthValue = arrayOf("mamtha",0,8,"nemani")

    var myArray5: IntArray = intArrayOf(5,10,20,12,9)



    myArray[2] = 10
    myArray[3] = 20
    myArray[4] = 40

    for(i in myArray ){
        println(i)
    }
    println()

    for(i in integer){
        println(i)
    }
    println()

    for(i in names){
        println(i)
    }
    println()

    for( i in stringvthValue)
    {
        println(i)
    }
    println()

    for( i in myArray5)
    {
        println(i)
    }
}