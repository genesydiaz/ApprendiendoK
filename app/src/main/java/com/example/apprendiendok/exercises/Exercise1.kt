package com.example.apprendiendok.exercises

/**
Por lo general, el teléfono te proporciona un resumen de las notificaciones.
En el código inicial que se proporciona en el siguiente fragmento de código,
escribe un programa que imprime el mensaje de resumen segun la cantidad de
notificaciones que recibiste. El mensaje debe incluir lo siguiente:
La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más
RESULTADO:
- Tienes 51 notificaciones.
- ¡Tu teléfono está explotando! Tienes más de 99 notificaciones.
 */


fun main() {
    val morningNotification = 70
    val eveningNotification = 135


    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    }

fun printNotificationSummary(numberOfMessage: Int) {
    // Fill in the code.
    when(numberOfMessage){
        in 1..99 -> println("Tienes $numberOfMessage notificaciones")
        in 100..300 -> println("¡Tu teléfono está explotando! Tienes más de 99 notificaciones")
    }
    if(numberOfMessage <= 99) {
        println ("Tienes $numberOfMessage notificaciones con el if")
    } else {
        println ("¡Tu teléfono está explotando! Tienes más de 99 notificaciones con el if")
    }
}
