package it.develhope.exercise4

fun main(){

    fun printNumberBelow50(number: Int){
        println("Number below 50: $number")
    }

    fun printNumberAbove50(number: Int){
        println("Number above 50: $number")
    }

    for (i in 1..100 step 2) {
        if (i < 50) {
            printNumberBelow50(i)
        } else {
            printNumberAbove50(i)
        }
    }
}