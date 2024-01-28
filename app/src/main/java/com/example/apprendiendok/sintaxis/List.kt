package com.example.apprendiendok

fun main(){
    mutableList()

}

fun inmutableList(){
    var readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)

    //Escribir (readOnly) equivale a llamar la funcion .toString() (readOnly.toString()) y mostrara
    //los valores de cada posicion:
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


    //Filtrar la lista usando .filter y entre {} colocar lo que queremos filtrar usando it.contains()
    val example = readOnly.filter {it.contains("a")}
    println(example)

    //Iterar (repetir variads veces un proceso para llegar al objetivo)
    readOnly.forEach {weekDay -> println(weekDay)}

}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(3,"AristiDay")
    println(weekDays)

    if (weekDays.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        weekDays.forEach{println(it)}
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach{println(it)}
    }
    weekDays.last()

}
