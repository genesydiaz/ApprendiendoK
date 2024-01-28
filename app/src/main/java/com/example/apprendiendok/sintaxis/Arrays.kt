package com.example.apprendiendok

/**
 * Arrays o Arreglos: estructura de datos que nos permite almacenar varias variables
 */
fun main(){
    //En vez de hacer varias variables de esta forma:
    var name = "Aristidevs"
    var name1 = "Aristidevs"
    var name2 = "Aristidevs"
    var name3 = "Aristidevs"

/*Se puede usar un Array y cada variable se ubicara en una posicion dentro de la "lista" o
Indice del Array. Las posiciones se establecen de forma ascendente empezando por el cero con
la primera variable. En el siguiente caso 0 = Lunes, 1 = Martes, 2 = Miercoles...*/

    val weekDays= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

//Para llamar una de las variables se debe colocar la posicion dentro de [] de la siguiente forma:

    println(weekDays[0])

/*El tamaño de un Array va a depender de la cantidad total de items que haya en su lista, es decir,
la cantidad de variables que posea su Indice. Para el ejemplo que estamos usando, su Indice = 0-6
y su Tamaño = 7. Para saber el tamaño de un Array se puede ejecutar:*/

    println(weekDays.size)

    if (weekDays.size >= 8) {
        println (weekDays[7])
    } else {
        println ("No hay mas valores en el Array")
    }

//A una posicion le podemos asignar otro valor, por ejemplo:

    weekDays[0] = "Feliz Lunes"
    println (weekDays[0])

/*Bucles para Arrays. Para recorrer un Array pasando por cada una de sus posiciones, de esta forma
se puede indicar la posicion o indice, se puede indicar el valor y la posicion o indicar solo el valor de
cada posicion (la variable "position" puede nombrarse de la forma mas conveniente):*/

    for(position in weekDays.indices){
     println("He pasado por aquí")
     println("He pasado por aquí $position")
     println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("La posicion $position contiene un $value")
    }

    for(value in weekDays){
        println("Ahora es $value")
    }
}

