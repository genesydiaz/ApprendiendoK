package com.example.apprendiendok

fun main(){
    ifMultipleOR()

}

fun ifMultipleOR(){
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro que esta feliz")
    }

}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("Puedes beber cerveza")
    }
}

fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Puedes tomar cerveza")
    } else {
        println("Puedes tomar jugo")
    }
}

fun ifBoolean(){
    var soyFeliz = false

    //con ! al principio == false
    //sin nada al principio == true

    if(!soyFeliz){
        println("Estoy triste :(")
    }
}

fun ifBasico() {
    val name = "Aris"

    if (name == "Pepe") {
        println("El valor de name es Aris")
    } else {
        println("Este no es Aris")
    }
}
fun ifAnidado(){

    val animal = "perro"

    if(animal == "perro"){
        println("Es un perro")
    } else if(animal == "perro"){
        println("Es un gato")
    } else if(animal == "pajaro"){
        println("Es un pajaro")
    } else {
        println("No se que animal es")
    }

}
