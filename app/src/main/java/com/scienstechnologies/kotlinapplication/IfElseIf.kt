package com.scienstechnologies.kotlinapplication

fun main(args : Array<String>){
    print("Enter text: ")
    val num = readLine()!!

   // val num = 10
    val result = if(num > 0.toString())
    {
        "$num is Positive"
    }else if(num < 0.toString()) {
        "$num is Negative"
    }else{
       "$num is Zero"
    }
    println(result)
}