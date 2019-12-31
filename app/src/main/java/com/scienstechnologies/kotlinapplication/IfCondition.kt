package com.scienstechnologies.kotlinapplication

fun main (args : Array<String>){
    val num1 = 10;
    val num2 = 20;
    val result = if(num1 < num2){
        "$num1 is grater than $num2"

    }else{
        "$num1 is less than $num2"
    }
    println(result)
}