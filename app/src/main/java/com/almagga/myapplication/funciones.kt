package com.almagga.myapplication

fun main(){
    saludar()
    showMyName("alma")
    showMyAge(29)
    add(85,70)
    val result = subtract(62,41)
    println("resultado de resta $result")
    val result2 = multiplicar(3,5)
    println("resultado de multiplicacion $result2")

}

fun saludar(){
    println("hola mundo")
}

fun showMyName(text:String="alma"){
    println("me llamo $text")
}

fun showMyAge(currentAge:Int){
    println("tengo $currentAge años")

}

fun add(firstNumber:Int, secondNumber: Int){
    val result=firstNumber + secondNumber
    println("resultado de suma $result")
}

fun subtract( firstNumber:Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}

fun multiplicar( firstNumber:Int, secondNumber: Int) = firstNumber * secondNumber