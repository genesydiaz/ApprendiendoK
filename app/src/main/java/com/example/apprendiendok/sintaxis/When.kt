package com.example.apprendiendok

//Si se deben hacer varias concatenaciones el when es una buena opción.

fun main(){
    getMonth(6)
    getTrimester(3)
    getRango(850)
    mixRangoYElemento(6)
    result("Si coloco dos numeros en la funcion result no se suman")
    result(false)
    result (35)

}
//El valor 'ANY' se usa aqui solo para efectos del ejemplo. NO ES RECOMENDABLE USAR EL VALOR 'ANY'
fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(!value) println("Hola")
    }
}

fun mixRangoYElemento (month: Int){
    when(month) {
        1, 2, 3 -> println ("Primer trimestre")
        4, 5, 6 -> println ("Segundo trimestre")
        7, 8, 9 -> println ("Tercer trimestre")
        10, 11, 12 -> println ("Cuarto trimestre")
        !in 1..12 -> println ("Trimestre no valido")
    }

}

//getRango corresponde al ejemplo getSemester del min. 1:57:00 del video (AristiDevs)
fun getRango(month: Int){
    //'When' puede recibir o no parametros
    when(month){
        //Para establecer un rango usar dos puntos
        in 1..876 -> println("Primer Rango")
        in 877..1233 -> println ("Segundo rango")
        !in 1..1233 -> println("Rango no válido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 11 -> println("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}

