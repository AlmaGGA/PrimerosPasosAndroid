package com.almagga.myapplication

fun main(){
    val age:Int =29
    var age2:Int = 30

    var name:String = "Alma"
    var text:String ="Hola "

    println("sumar: ")
    println(age+age2)

    println("restar:")
    println(age-age2)

    println("multiplicar:")
    println(age*age2)

    println("dividir:")
    println(age/age2)

    println(text +name)

    println("resto:")
    println(age%age2)

    text ="hola me llamo $name y tengo $age años"
    println(text)
}