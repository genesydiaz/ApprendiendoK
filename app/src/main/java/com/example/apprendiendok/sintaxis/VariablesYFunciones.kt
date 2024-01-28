package com.example.apprendiendok

val age: Int = 30

fun main() {
    val age = 32
    showMyName()
    showMyAge(age)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyName(){
    println("Gene.Diaz")
}

fun showMyAge (currentAge: Int){
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    print(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun variablesNumericas() {
    /**
     * Variables Numericas
     */
    //Int (Integer = Entero) -2,147,483,647 a 2,147,483,647
    var age2: Int = 32
    age2 = 29

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30
    val example2: Long = 30

    //Float (soporta hasta 6 decimales)
    val floatExample: Float = 30.5f

    //Double (soporta 14 decimales)
    val doubleExample: Double = 3241.37218379

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Modulo:")
    println(age % age2)

    var exampleSuma = age + floatExample
}

fun variablesAlfanumericas() {
    /**
     * Variables Alfanumericas
     */

    //Char (character) Soporta 1 solo caracter de número, letra o símbolo, pero debe ir entre comillas simples
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "AristiDevs suscribete"
    val stringExample2 = "AristiDevs"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example123: String = age.toString()
}

fun variablesBooleanas(){
    /**
     * Variables Booleanas
     */

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
}