package ru.netology

fun main() {
    val minComission: Double = 3500.00
    val standardComission = 0.0075
    var finalComission = 0.00

    println("Vvedite summu v kopeykah")
    val a = readLine()
    val amount = a!!.toDouble()
    if (amount * standardComission >= minComission) {
        finalComission = (amount * standardComission)
    } else finalComission = minComission
    println("Komissiya sostvit " + finalComission + " kopeek")

}