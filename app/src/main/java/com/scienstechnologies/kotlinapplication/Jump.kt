package com.scienstechnologies.kotlinapplication

fun main( args : Array<String>){
    for(i in 1..5){
        if( i==3)
        {
            continue
        }
        println(i)
    }
}
